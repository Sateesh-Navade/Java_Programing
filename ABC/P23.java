package ABC;

//remove all special characters in a given string
public class P23 {
	public static void main(String[] args) {
		String s = "abc@123#";// o/p=abc123
		for (int i = 0; i < s.length(); i++) {
			char c=s.charAt(i);
//			System.out.println(c);
			if(c>='a'&&c<='z'||c>='1'&&c<='9') {
				System.out.print(c);
			}
		}
	}
}
