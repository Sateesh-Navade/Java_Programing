package ABC;
//insert "ABC" in front of every numeric characters from a given input String
public class P80 {
	public static void main(String[] args) {
		String s="apple1230"; //o/p=apple1ABC2ABC3ABC
		String r="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c>='1'&&c<='9'||c=='0') {
				r=r+c+"-ABC,";
			}else
				r=r+c;
		}
		System.out.println(r);
	}
}
