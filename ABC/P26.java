package ABC;

//count spaces from a given string
public class P26 {
	public static void main(String[] args) {
		String s = "abc d e f";// o/p=3
		int count=0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c==' ') {
				count++;
			}
		}
		System.out.println(count);
	}
}
