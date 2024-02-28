package ABC;

//WAP to remove all consonants from the given input string
public class P18 {
	public static void main(String[] args) {
		String s = "apple";// o/p=ae
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
				System.out.print(s.charAt(i));
		}
	}
}
