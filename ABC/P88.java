package ABC;
//insert "ABC" in front of every alpha-numeric characters from a given input string
public class P88 {
	public static void main(String[] args) {
		String s="Abc@123",r="";//o/p=abc@1ABC2ABC3ABC
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c>='0'&&c<='9') {
				r=r+c+"ABC";
			}else {
				r=r+c;
			}
		}
		System.out.println(r);
	}
}
