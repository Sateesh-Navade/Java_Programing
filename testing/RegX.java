package testing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegX {
	public static void main(String[] args) {
		String s="apple12@gmail.com";
		s=s.toUpperCase();
		Pattern p= Pattern.compile("[A-Z,a-z]{3,6}#*[0-9]{1,8}@gmail[.]com");   //.*=like % in SQL(enara)          //Email= ("[A-Z,a-z]{3,6}#*[0-9]{1,8}@gmail[.]com")
		Matcher m= p.matcher(s);                                                // means= inside [] r that type charecters r only allowed & inside {} r number of char
		boolean ans=m.matches();
		System.out.println(ans);
	}
}
