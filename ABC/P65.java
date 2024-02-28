package ABC;
//insert "ABC" in place of all lowercase aplhabets in a given string
public class P65 {
	public static void main(String[] args) {
		String s="APPLe";//o/p=APPLABC
		String r="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c>='a'&&c<='z') {
				r=r+"ABC";
			}else
				r=r+c;
			
		}
		System.out.println(r);
	}
}
