
public class CountWords {
	public static void main(String[] args) {
		String s = " How are you";
		char[] c = s.toCharArray();
		int co = 0;

		for (int i = 0; i < s.length(); i++) {
			if(i==0&&c[i]!=' ' || c[i]!=' '&&c[i-1]==' ')
				co++;
		}
		System.out.println(co);
	}
}