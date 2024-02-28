package ABC;
//insert "ABC" in place of spaces from a given string
public class P63 {
	public static void main(String[] args) {
		String s="x y z";//o/p=xABCyABCz
		String r="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c==' ') {
				r=r+"ABC";
			}else
				r=r+c;
		}
		System.out.println(r);
	}
}
