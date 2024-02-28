package ABC;

import java.util.Arrays;
import java.util.Iterator;

//print the all the sub-array who’s sum is equal to the key.
//Input: arr[] = {1, 4, 0, 0, 3, 10, 5}, key = 7
//Output: Sum found between indexes 1 and 4
//Explanation: Sum of elements between indices 1 and 4 is 4 + 0 + 0 + 3 = 7
public class P125 {
	public static void main(String[] args) {
		int arr[] = {1, 4, 0, 0, 3, 10, 5};   //Sum found between indexes 1 and 4
		int key=7;
		boolean flag=false;
		for (int i = 0; i < arr.length; i++) {
			int sum=arr[i];
			if(arr[i]==key) {
				System.out.println("Sum found in index :"+i);
			}else {
				for (int j = i+1; j < arr.length; j++) {
					sum=sum+arr[j];
					if(sum==key) {
						System.out.println("Sum Found between index :"+i+" & "+j);
						flag=true;
						for (int k = i; k <= j; k++) {
							System.out.print(arr[k]+" ");
						}
					}
				}
			}
		}
		if(flag==false)
		System.err.println("No Sub Array Found");
	}
}
