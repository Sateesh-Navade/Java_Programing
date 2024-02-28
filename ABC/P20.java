package ABC;

//WAP to remove all uppercase vowels from a input string
public class P20 {
	public static void main(String[] args) {
		String s = "APPLEapple";// PPLapple
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U')
				System.out.print(s.charAt(i));
		}
	}
}
