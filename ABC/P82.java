package ABC;
//insert "ABC" in front of every lowercase vowels from a input string
public class P82 {
	public static void main(String[] args) {
		String s="AppLE",r="";//o/p=ApABCpABCLE
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c>='a'&&c<='z') {
				r=r+c+"ABC";
			}else
				r=r+c;
		}
		System.out.println(r);
	}
}
