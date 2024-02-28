import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
	public static void main(String[] args) {
		String s="abc@gmail.com";
		
		Pattern p=Pattern.compile("[A-Z,a-z]{2,8}#*[0-9]{0,9}@gmail[.]com");
		Matcher m=p.matcher(s);
		boolean res=m.matches();
		
		System.out.println(res?"Email":"Not a Email");
	}
}
