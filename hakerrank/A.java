package hakerrank;

public class A {
	public static void main(String[] args) {
		String s1="Hello"; s1=s1.toLowerCase();
		String s2="hoEll";s2=s2.toLowerCase();
		String c="";
		
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		
		if (s1.length()!=s2.length()) {
			System.out.println("Not Anagram");
		}
		for (int i = 0; i < c1.length; i++) {
			for (int j = 0; j < c2.length; j++) {
				if (c1[i]==c2[j]) {
					c+=c2[j];
					break;
				}
			}
		}
		System.out.println(s1.equals(c)? "Anagram":"Not Anagram");
	}
}
