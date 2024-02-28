package hakerrank;

import java.util.Scanner;

public class ArmStrong {
	static int countDigit(int n) {
		int count = 0;
		while (n > 0) {
			count++;
			n = n / 10;
		}
		return count;
	}

	static int power(int base, int ex) {
		int pow = 1;
		for (int i = 1; i <= ex; i++) {
			pow = base * pow;
		}
		return pow;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no");
		int n = scan.nextInt();

		int sum = 0, rem = 0, m = n;
		int ex = countDigit(n);
		while (n > 0) {
			rem = n % 10;
			sum = sum + power(rem, ex);
			n = n / 10;
		}
		System.out.println((sum == m) ? "ArmStrong No" : "Not a ArmStrong No");
	}
}
