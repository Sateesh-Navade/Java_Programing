package ABC;

public class AddingStringInfrontOfNumbers {
	static String r = "";

	public static void main(String[] args) {
		String s = "apple12abc123", r = ""; // o/p= apple12ABCabc123ABC
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				r = r + s.charAt(i);
				if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
					if (s.charAt(j) >= '0' && s.charAt(j) <= '9') {
					} else {
						r = r + "ABC";
						break;
					}
				}
				break;
			}
		}
		if (s.charAt(s.length() - 1) >= '0' && s.charAt(s.length() - 1) <= '9') {
			System.out.println(r + s.charAt(s.length() - 1) + "ABC");
		} else {
			System.out.println(r + s.charAt(s.length() - 1));
		}
	}

}

