package hakerrank;

public class Number {
	public static void main(String[] args) {
		int n=10,i=1,sum=0,c=0;
		System.out.println("Even Numbers");
		while(i<=n) {
			if(i%2==0) {
				c++;
			System.out.print(i+" ");
			sum+=i;
		}
			i++;
		}
		System.out.println();
		System.out.println("Sum of Even Numbers :"+sum);
		System.out.println("Count Of Evaen Numbers :"+c);
	}
}
