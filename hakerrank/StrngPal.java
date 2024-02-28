package hakerrank;

public class StrngPal {
	public static void main(String[] args) {
		String s="Gadag";
		String rev="";
		s=s.toLowerCase();
		char[] c= s.toCharArray();
		for (int i = s.length()-1; i >= 0; i--) {
			rev +=c[i];
		}
		System.out.println(rev.equals(s)? "Palandrome":"Not a Plandrome");
	}
}
