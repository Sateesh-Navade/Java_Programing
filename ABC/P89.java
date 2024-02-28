package ABC;
//place all the Special Characters present in a String at end of the String?
public class P89 {
	public static void main(String[] args) {
		String s="*abc@123",r="";//o/p=abc123*@
		String specialch="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c>='a'&&c<='z'||c>='0'&&c<='9') {
				r=r+c;
			}else
				specialch=specialch+c;
		}
		System.out.println(r+specialch);
	}
}
