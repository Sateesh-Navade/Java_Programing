package ABC;

import java.util.Arrays;

//print the Kth smallest element in an given array.
public class P121 {
	public static void main(String[] args) {
		int[] arr = { 5, 2, 6, 3, 1, 4 }; 
		Arrays.sort(arr);
		int k=2;
		int c=0;
		
//		int small=arr[0];
//		for (int i = 0; i < arr.length; i++) {
//			if(small>arr[i]) {
//				small=arr[i];
//			}
//		}
		System.out.println(arr[k-1]);
	}
}
