package testing;


public class ArmStrong {
	
	static int count(int n) {
		int c=0;
		while (n!=0) {
			c++;
			n=n/10;
		}
		return c;
	}
	
	static int power(int base, int ex) {
		int pow=1;
		for(int i=1;i<=ex;i++) {
			pow=pow*base;
		}
		return pow;
	}
	
	public static void main(String[] args) {
		int n=153,sum=0,m=n;
		int ex=count(n);
		while (n!=0) {
			sum=sum+power(n%10, ex);
			n=n/10;
			}
		System.out.println(m==sum?"Arm":"Not ARM");
	}
}
