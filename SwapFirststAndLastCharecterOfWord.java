
public class SwapFirststAndLastCharecterOfWord {
	public static void main(String[] args) {
		String s = " how are you";// o/p=woh era uoy
		char[] c = s.toCharArray(); String r="";

		for (int i = 0; i < c.length; i++) {
			int k=i;
			while (i < c.length && c[i] != ' ') {
				i++;
			}
			char temp=c[k];
			c[k]=c[i-1];
			c[i-1]=temp;
		}
		System.out.println(String.valueOf(c));
	}
}
