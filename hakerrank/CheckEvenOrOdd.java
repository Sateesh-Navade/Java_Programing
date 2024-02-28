package hakerrank;

public class CheckEvenOrOdd {
	public static void main(String[] args) {
		int n = 2032;
		if (n % 4 == 0 || n % 400 == 0 && n % 100 == 0)
			System.out.println("Leap Year");else
		System.out.println("Not Leap Year");
	}
}
