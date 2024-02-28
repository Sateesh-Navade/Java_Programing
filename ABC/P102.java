package ABC;
//find the sum of all even nummbers
public class P102 {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 2, 1 };          //o/p=4
		int sum=0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0) {
				sum=sum+arr[i];
			}
		}
		System.out.println(sum);
	}
}
