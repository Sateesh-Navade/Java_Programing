package ABC;

import java.util.Arrays;

//WAP to reverse an array without creating a new array.
public class P129 {
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5}; //5 4 3 2 1
		String s="";
		for (int i = arr.length-1; i >= 0; i--) {
			s=s+arr[i];
		}
		System.out.println(Arrays.toString(s.toCharArray()));
	}
}
