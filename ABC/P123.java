package ABC;

//find the first repeating element in an array of integers
public class P123 {
	public static void main(String[] args) {
		int arr[] = { 10, 5, 3, 4, 3, 5, 6}; // o/p=5
		int r = 0, c = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					r = arr[i];
					c++;
					break;
				}
			}
			if (c == 1) {
				System.out.print(r);
				break;
			}
		}
	}
}
