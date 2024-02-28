import java.util.Arrays;

//left rotate Array to 2times
public class Rotate {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };// o/p=3456712
		int k = 3;
		int n = arr.length;
		rotate(arr, k, n);
	}

	static void rotate(int[] arr, int k, int n) {
		int temp[] = new int[n];
		int d = 0;

		for (int i = k; i < n; i++) {
			temp[d] = arr[i];
			d++;
		}
		for (int i = 0; i < k; i++) {
			temp[d] = arr[i];
			d++;
		}
		System.out.println(Arrays.toString(temp));
	}
}
