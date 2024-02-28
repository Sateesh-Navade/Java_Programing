package ABC;
//insert "ABC" in place of vowels in a given string
public class P64 {
	public static void main(String[] args) {
		String s="apple";//o/p=ABCpplABC
		String r="ABC",s1="";
		for (int i=0;i<s.length();i++) {
			char c= s.charAt(i);
			if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				s1+=r;
			}
			else {
				s1+=c;
			}
		}
		System.out.println(s1);
	}
}
