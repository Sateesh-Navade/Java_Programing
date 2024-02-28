package ABC;

//find the sum of all the odd numbers
public class P103 {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 2, 1, 5 }; //10
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 1) {
				sum=sum+arr[i];
			}
		}
		System.out.println(sum);
	}
}
