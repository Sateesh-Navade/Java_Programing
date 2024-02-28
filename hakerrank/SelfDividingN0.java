package hakerrank;

public class SelfDividingN0 {

	static boolean selfDivide(int n) {
		int m = n;
		while (m > 0) {

			int r = n % 10;

			if ((r != 0) && (n % r == 0))
				return true;
			m /= 10;
		}
		return false;
	}

	public static void main(String args[]) {
		int n = 24;
		System.out.println(selfDivide(n) ? "SDN" : "Not SDN");
	}
}
