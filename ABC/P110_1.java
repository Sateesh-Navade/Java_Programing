package ABC;

import java.util.Arrays;

//find the second smallest number in a given array
public class P110_1 {
	public static void main(String[] args) {
		int arr[] = { 20, 3, 2, 5, 10, 30, 60, 50 }; // 3
		sortNumbers(arr);
		
		System.out.println("Second Smallest is :"+arr[1]);
		System.out.println("Second Bigest is :"+arr[arr.length-2]);
	}

	private static void sortNumbers(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
