package ABC;
//insert "ABC" in front of every special characters in a given string
public class P86 {
	public static void main(String[] args) {
		String s="Abc@123",r="";//o/p=abc@ABC123
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c>='a'&&c<='z'||c>='0'&&c<='9') {
				r=r+c;
			}else {
				r=r+c+"ABC";
			}
		}
		System.out.println(r);
	}
}
