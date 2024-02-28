package ABC;
//find the product of all even nummbers
public class P106 {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 2, 1, 5, 4 };       //16     
		int product=1;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				product*=arr[i];
			}
		}
		System.out.println(product);
	}
}
