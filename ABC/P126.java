package ABC;

import java.util.Arrays;

//print the all the sub-array who’s sum is greater than the 2nd largest number.

public class P126 {
	public static void main(String[] args) {
		int arr[] = { 1, 4, 3, 10, 5 }; //
		boolean flag = false;
//		int arr1=Arrays.sort(arr);
//		int secondlrg=arr[arr.length-2];
		int secondlrg = 5;

		for (int i = 0; i < arr.length; i++) {
			int sum = arr[i];

//			if (sum > secondlrg) {		
//					System.out.println("Greater Sum found in index :" + i);
//			} else {
				for (int j = i + 1; j < arr.length; j++) {
					sum = sum + arr[j];
					if (sum == secondlrg) {
						System.out.println("Greater Sum found in index between :" + i + " & " + j);
						flag = true;

						for (int k = 0; k <= j; k++) {
							System.out.print(arr[k] + " ");
						}
					}
				}
			}
//		}
	}
}
