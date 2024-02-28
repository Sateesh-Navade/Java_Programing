package ABC;

import java.util.Arrays;

//Rotate the given array.
public class P128 {
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6, 7};  //[3, 4, 5, 6, 7, 1, 2]
		int d=1;
		String temp="";
		
		for (int i = d; i < arr.length; i++) {
			temp+=arr[i];
		}
		for (int i = 0; i < d; i++) {
			temp+=arr[i];
		}
		System.out.println(Arrays.toString(temp.toCharArray()));
	}
}
