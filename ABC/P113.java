package ABC;

import java.util.Arrays;

//reverse an Array ?

public class P113 {
	public static void main(String[] args) {
		int arr[] = {1, 3, 4, 2, 6};
		int r[]=new int[arr.length];
		int c=1;
		for (int i = 0; i < r.length; i++) {
			r[i]=arr[arr.length-c];
			c++;
		}
		System.out.println(Arrays.toString(r));
	}
}
