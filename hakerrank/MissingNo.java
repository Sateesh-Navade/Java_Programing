package hakerrank;

//Find the missing number in an array?
//Approach
//1. Calculate A = n (n+1)/2 where n is largest number in series 1…N.
//2. Calculate B = Sum of all numbers in given series
//3. Missing number = A – B

public class MissingNo {
	public static void main(String[] args) {
		int[] arr= {1, 2, 3, 4, 6, 7};
		int n=7;
		int A= n*(n+1)/2;
		int B=0;
		for (int i : arr) {
			B+=i;
		}
		System.out.println(A-B);
	}
}
