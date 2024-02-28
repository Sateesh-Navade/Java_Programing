import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BadByRegx {
	public static void main(String[] args) {
		String s="xbadxx";
		
		Pattern p=Pattern.compile("xbad.*");
		Matcher m=p.matcher(s);
		boolean ans=m.matches();
		 
		System.out.println(ans);
	}
}
