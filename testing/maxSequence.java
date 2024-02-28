package testing;

public class maxSequence {
	public static void main(String[] args) {
		int arr[]= {1,2,9,0,5,6,7,8,10,20};//max sequence 5,6,7,8
		int c=0,c1=0;
		int []a = {};
		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i+1]==arr[i]+1) {
					System.out.println(arr[i]); 
					a[i] = arr[i];
					c1++;
				}
				if(c1>c) {
					c=c1;
				}
			}
		}
	}
}
