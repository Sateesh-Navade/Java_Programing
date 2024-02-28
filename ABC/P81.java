package ABC;

//insert "ABC" in front of every consonants from the given input string
public class P81 {
	public static void main(String[] args) {
		String s = "apple",r="";// o/p=apABCpABClABCe
		for (int i = 0; i < s.length(); i++) {
			char c=s.charAt(i);
			if(c=='a'||c=='e'||c=='o'||c=='i'||c=='u') {
				r=r+c;
			}else
				r=r+c+"ABC";
		}
		System.out.println(r);
	}
}
