package ABC;
//find the product of all odd index
public class P109 {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 2, 1, 5, 4 };       //20   
		int product=1;
		
		for (int i = 0; i < arr.length; i++) {
			if(i % 2 == 1) {
				product*=arr[i];
			}
		}
		System.out.println(product);
	}
}
