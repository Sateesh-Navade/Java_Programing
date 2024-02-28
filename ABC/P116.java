package ABC;

import java.util.Arrays;

//put even and odd elements of an Array in 2 separate Arrays?
public class P116 {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6};   //o/p= [1,3,5] [2,4,6]
		String e="";
		String o="";
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0) {
				e+=arr[i];
			}else
				o+=arr[i];
		}
		
		System.out.println(Arrays.toString(e.toCharArray()));
		System.out.println(Arrays.toString(o.toCharArray()));
	}
}
