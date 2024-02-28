package ABC;

//print all the pair of numbers whose difference is equal to the key value
public class P111 {
	public static void main(String[] args) {
		int arr[] = {5, 12, 3, 2, 90, 80}, key = 78;  //o/p=  //90 12
		                                                     //80 2
		for (int i = 0; i < arr.length; i++) { 
			for (int j = 0; j < arr.length; j++) {
				if(arr[i]-arr[j]==key) {
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
		}
	}
}
