package ABC;

//remove all alpha-numeric characters from a given input string
public class P25 {
	public static void main(String[] args) {
		String s = "abc@123#";// o/p=@#
		s = s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= 'a' && c <= 'z' || c >= '1' && c <= '9') {
			} else
				System.out.print(c);
		}
	}
}
