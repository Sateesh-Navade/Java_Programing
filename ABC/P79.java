package ABC;

public class P79 {
	public static void main(String[] args) {
		String s="ApplE"; //o/p=AABCpplEABC
		String r="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c>='A'&&c<='Z') {
				r=r+c+"ABC";
			}else
				r=r+c;
		}
		System.out.println(r);
	}
	
}
