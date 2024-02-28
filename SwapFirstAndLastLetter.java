
public class SwapFirstAndLastLetter {
	public static void main(String[] args) {
		String s = "hoW aRe yOu";// o/p=woh era uoy
		s = s.toLowerCase();
		char[] c = s.toCharArray();

		for (int i = 0; i < s.length(); i++) {
			int k =i;
			// looping Word
			while (i < s.length() && c[i] != ' ' ) {
				i++; 
			}
			char temp=c[k];
			c[k]=c[i-1];
			c[i-1]=temp;
			
		}
		System.out.println(String.valueOf(c));
	}
}
