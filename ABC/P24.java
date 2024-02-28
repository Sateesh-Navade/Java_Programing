package ABC;

//remove all alphacharacters from a given input string
public class P24 {
	public static void main(String[] args) {
		String s = "Abc@123";// o/p=@123
		s=s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= 'a' && c <= 'z') {
			} else
				System.out.println(c);
		}
	}
}
