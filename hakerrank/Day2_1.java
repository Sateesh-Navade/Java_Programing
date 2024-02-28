package hakerrank;

public class Day2_1 {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4};
		
	    for (int i = 0; i < arr.length-1; i++) {
	    	arr[i]=arr[i]+arr[i+1];
		}
	    arr[arr.length-1]=0;
	    for (int i : arr) {
			
	    	System.out.println(i);
		} 
	}
}
