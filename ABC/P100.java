package ABC;

import java.util.Arrays;

import hakerrank.MissingNo;

//find the missing number in given integer array of 1 to 100?
public class P100 {
	public static void main(String[] args) {
		
		int[] arr= {1,4,2,5,8,6,9};//3 7
		Arrays.sort(arr);
		MissingNo(arr);
	}

	private static void MissingNo(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]+1==arr[j]) {
					
				}else
					System.out.print(arr[i]+1+" ");
				break;
			}
		}
	}
}
