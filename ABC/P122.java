package ABC;

import java.util.Arrays;

//print the common elements in the 3 sorted arrays.
public class P122 {
	public static void main(String[] args) {
		int arr1[] = { 1, 2, 5, 5, 5, 6 };                         // o/p=5 5
		int arr2[] = { 3, 4, 5, 5, 5, 6, 10 };             
		int arr3[] = { 5, 5, 5, 6, 10, 20 };
		int k=0;

		int[] m1 = new int[10];
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if(arr1[i]==arr2[j]) {
					m1[k]=arr1[i];           //5 5 5 5
					k++;
					break;
				}
			}
		}
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < arr3.length; j++) {
				if(m1[i]==arr3[j]) {
					System.out.print(m1[i]+" ");
					break;
				}
			}
		}
//		System.out.println(Arrays.toString(m1));
	}
}
