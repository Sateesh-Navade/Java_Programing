package testing;

public class MakeMeSingle {
	
	static int itsSum(int n) {
		int sum=0;
		while (n>0||sum>9) {
			if(n==0) {
				n=sum;
				sum=0;
			}
			sum=sum+n%10;
			n/=10;
			
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		int n=439175;
		System.out.println(itsSum(n));
	}
}
