package hakerrank;

import java.util.Arrays;

public class Anagram {

	static String Anagram(String s1,String s2) {
		if (s1.length()!=s2.length()) {
			return "Not Anagram";
		}

		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		char[] c1=s1.toCharArray();//{r,a,c,e}
		char[] c2=s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		return (Arrays.equals(c1, c2))?"Anagram":"Not Anagram";		
	}

	public static void main(String[] args) {
		
		String res=Anagram("Holel ","hello" );
		System.out.println(res);
	}
}


