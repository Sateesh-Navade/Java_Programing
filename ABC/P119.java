package ABC;

import java.util.Arrays;

//Sort an array using Selection Sort.
public class P119 {
	public static void main(String[] args) {
		int[] arr = { 5, 2, 6, 3, 1, 4 }; // [1, 2, 3, 4, 5, 6] //here we need to swap 5 and 1
		
		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
				int temp=arr[min];
				arr[min]=arr[i];
				arr[i]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}
