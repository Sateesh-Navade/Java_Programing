package ABC;

//find the smallest and Bigest number in a given array
public class P110 {
	public static void main(String[] args) {
		int arr[] = { 20, 3, 2, 5, 10, 30, 60, 50 }; // 1  60
		int small=arr[0],c=0;
		int big=arr[1];

		for (int i = 0; i < arr.length; i++) {
				if (arr[i] < small) {
					small=arr[i];
					c++;
				}else if(arr[i]>big)
					big=arr[i];
			}
		
		System.out.println(small +" "+ big);
	}
}
