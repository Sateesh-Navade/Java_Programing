public class TestTaker {

  public static String main( String[] items ) {
  
	   int totalPrice = 0;
	   int salePrice = 0;
	   for(String item: items) {
		  java.util.Optional<String> priceStr = findPrice(item);
		  int price = Integer.parseInt(priceStr.get());

		  java.util.Optional<String> percentOffStr = findPercentOff(item);
		//   int percentOff = Integer.parseInt(percentOffStr.get());
		            int percentOff = Integer.parseInt(percentOffStr.orElse("0").replace("%", ""));

		  totalPrice = price;
		  salePrice += price*percentOff/100.0;
	   }
	   int amountSaved = totalPrice-salePrice;
	   StringBuffer sb = new StringBuffer();
	   sb.append("Total Original Price:")
		 .append(totalPrice)
		 .append("$;Amount saved:")
		 .append(amountSaved)
		 .append("$;");
	 return sb.toString();
  }

  private static java.util.Optional<String> findPrice(String line) {
	  String regex = "\\d*\\$";
	  java.util.regex.Matcher m = java.util.regex.Pattern.compile(regex).matcher(line);
	  if(m.find()) {
		  try{
			  String priceStr = m.group();
			  return java.util.Optional.of(priceStr);
		  }catch(java.time.format.DateTimeParseException ex) {
			  return java.util.Optional.empty();
		  } 
	   }
	   return java.util.Optional.empty();
  }
  private static java.util.Optional<String> findPercentOff(String line) {
	  String regex = "\\d*%";
	  java.util.regex.Matcher m = java.util.regex.Pattern.compile(regex).matcher(line);
	  if(m.find()) {
		  try {
			  String percentOffStr = m.group();
			  return java.util.Optional.of(percentOffStr);
		  }catch(java.time.format.DateTimeParseException ex) {
			  return java.util.Optional.empty();
		  } 
	   }
	   return java.util.Optional.empty();
  }
  
}