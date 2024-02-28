package testing;

public class Finding_Uniqe_char {
	public static void main(String[] args) {
		String a="apple";
		String b="banana";   //b l e
		String s=a.concat(b);
		
//		char[] c=s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			int c=0;
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(i)==s.charAt(j) && i!=j) {
					c=1;
					break;
				}
			}
			if (c==0) {
				System.out.println(s.charAt(i));
			}
		}
	}
}
