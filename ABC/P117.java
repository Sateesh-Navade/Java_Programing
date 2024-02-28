package ABC;

import java.util.Arrays;

//sort the Array in Ascending order
//bubble sort
public class P117 {
	public static void main(String[] args) {
		int[] arr= {5,2,6,3,1,4};  //[1, 2, 3, 4, 5, 6]
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]>arr[j]) {           // for descanding ==>  if(arr[i]<arr[j])
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
