package ABC;

import java.util.Arrays;

//Merge 2 sorted arrays into resultant sorted array (sorting after merging is not allowed).
public class P124 {
	public static void main(String[] args) {
		int []arr1= {1,2,3,4,5};    //[1,2,3,4,5,6,7,8,9,10]
		int []arr2= {6,7,8,9,10}; int k=0;
		
		int []r=new int [arr1.length+arr2.length];
		
		for (int i = 0; i < arr1.length; i++) {
			r[i]=arr1[i];
		}
		for (int i = arr1.length; i < r.length; i++) {
			r[i]=arr2[k];
			k++;
		}
		System.out.println(Arrays.toString(r));
	}
}
