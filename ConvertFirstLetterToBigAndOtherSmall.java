
public class ConvertFirstLetterToBigAndOtherSmall {
	public static void main(String[] args) {
		String s = " hoW aRe yOu";// o/p= How Are You
		s = s.toLowerCase();

		char[] c = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			if (i == 0 && c[i] != ' ' || c[i] != ' ' && c[i - 1] == ' ') {
				c[i]=(char) (c[i]-32);   //-32 convert Small To Big, +32 big to Small
			}
		}
		System.out.println(String.valueOf(c));
	}
}
