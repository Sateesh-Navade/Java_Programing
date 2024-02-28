package ABC;
//insert "ABC" in front of every lowercase aplhabets in a given string
public class P78 {
	public static void main(String[] args) {
		String s="aPPLe"; //o/p=aABCPPLeABC
		String r="";
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
