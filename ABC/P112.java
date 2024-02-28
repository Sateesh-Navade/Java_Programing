package ABC;

//find the mean of the given array.
//=================================
//Sum of the elements is 1 + 3 + 4 + 2 + 6 + 5 + 8 + 7 = 36, Mean = 36/8 = 4.5
//Since number of elements are even, median is average of 4th and 5th largest elements, which means Median = (4 + 5)/2 = 4.5
public class P112 {
	public static void main(String[] args) {
		int arr[] = {1, 3, 4, 2, 6, 5, 8, 7};
		double l=arr.length;
		double sum=0;
		double mean=0,median=0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		mean=sum/arr.length;
		if(arr.length%2==1)
		median = arr.length/2;
		
		if(arr.length%2==0)
			median = (l/2 + (l/2+1))/2;
		
		System.out.println(mean);
		System.out.println(median);
	}
}
