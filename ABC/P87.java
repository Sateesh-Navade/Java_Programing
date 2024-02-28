package ABC;
//insert "ABC" in front of every alphacharacters from a given input string
public class P87 {
	public static void main(String[] args) {
		String s="Abc@123",r="";//o/p=aABCbABCcABC@123
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c>='a'&&c<='z') {
				r=r+c+"ABC";
			}else {
				r=r+c;
			}
		}
		System.out.println(r);
	}
}
