package ABC;

public class P13 {
	public static void main(String[] args) {
		String s = "abc  def  ghi jkl";// abc def ghi jkl
		String e = "";

		String op = s.replace("  ", " ");
		System.out.println(op);

//		for (int i = 0; i < s.length(); i++) {
//			char c = s.charAt(i);
//			if (Character.isWhitespace(c)) {
//				e = e + c;
//			}
//		}
//		System.out.println(e);

	}
}
