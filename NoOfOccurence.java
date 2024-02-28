import java.util.Arrays;

public class NoOfOccurence {
	public static void main(String[] args) {
		String s = "aabbc";

		boolean[] check = new boolean[s.length()];

		for (int i = 0; i < s.length(); i++) {
			int c = 1;
			for (int j = i + 1; j < s.length(); j++) {
				if (check[i] == false) {
					if (s.charAt(i) == s.charAt(j)) {
						c++;
						check[j] = true;
					}
				}
			}
			if(check[i]==false)
			System.out.println(s.charAt(i) + "==>" + c);
		}
	}
}
