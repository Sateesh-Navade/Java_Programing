package hakerrank;

public class Test {
	public static void main(String[] args) {
		String s1 = "ewekl1l2o3@e";
		String a = "", n = "", s = "";
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z' || s1.charAt(i) >= 'A' && s1.charAt(i) <= 'Z') {
				a = a + s1.charAt(i);
			} else if (s1.charAt(i) >= '1' && s1.charAt(i) <= '9') {
				n = n + s1.charAt(i);
			} else
				s = "" + s1.charAt(i);
		}
		System.out.println(a + n + s);
	}
}
