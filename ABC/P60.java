package ABC;

//convert all consonants to lowercase
public class P60 {
	public static void main(String[] args) {
		String s = "apple";// o/p=ApplE
		s = s.toUpperCase();
		String r = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
				if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
					r = r + c;
				} else {
					c = (char) (c + 32);
					r=r+c;
				}
			}
		}
		System.out.print(r);
	}
}
