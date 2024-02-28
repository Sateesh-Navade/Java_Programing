package hakerrank;

public class pal {
	public static void main(String[] args) {
		String s="Gadag";
		String rev="";
		
		for (int i = s.length()-1; i >= 0; i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(s.equalsIgnoreCase(rev)?"Pal":"not Pal");
	}
}
