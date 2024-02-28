
public class PrimeNumber {
	public static void main(String[] args) {
		int n = 3;
		System.out.println(isprime(n));
	}

	private static String isprime(int n) {
		int fact = 0;
		if (n < 2) {
			return "Not Prime";
		}
		for (int i = 2; i < n / 2; i++) {
			if (n % i == 0) {
				fact++;
			}
		}
		return fact == 0 ? "Prime Number" : "Not Prime Number";
	}
}
