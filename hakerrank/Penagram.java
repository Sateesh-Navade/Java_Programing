package hakerrank;

public class Penagram {
	public static void main(String[] args) {
		String s = "AbcdefghijKlmnopqrstuvwxyz"; 
		boolean flag=false;
		s=s.toLowerCase();
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (c[i]>= 'a' && c[i]<='z' && c.length==26) {
				flag=true;
			}
		}
		System.out.println(flag? "Panagram":"Not a Panagram");
	}
}
