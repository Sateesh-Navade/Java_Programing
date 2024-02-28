 // input - {10,20,30,40,50}
// wajp to print array elements according to their index value of fibonacci series
// means consider fibonacci series as index value of array elements 



public class Fib {
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};         //o/p=10 20 20 30 
		int []fib=fib(arr.length-1);
		
//		System.out.println(Arrays.toString(fib));   //[0, 1, 1, 2]
		
		for(int i=0;i<arr.length-1;i++) {
			System.out.print(arr[fib[i]]+" ");	
		}	
	}
	
	private static int[] fib(int length) {    //length=4
		int n1=0,n2=1,i=0,sum=0;
		int[] x=new int[length];     
		while (length>i) {
//			System.out.println(n1);  //0 1 1 2
			x[i]=n1;
			sum=n1+n2;
			n1=n2;
			n2=sum;	
			i++;
		}
		return x;
	}
}
