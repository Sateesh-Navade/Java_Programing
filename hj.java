//153=1+125+27=153
public class hj {
	public static void main(String[] args) {
		int n=153;
		int c=0;
		while(n!=0) {
			int r=n%10;
			c++;
			n=n/10;
		}
		int pow=factors(n%10,c);
		int sum=0;
		
	}

	private static int factors(int base, int c) {
		int pow=1;
		for(int i=0;i<=c;i++) {
			pow=pow*base;
		}
		return pow;
	}
}
