package hakerrank;

import java.util.Scanner;

public class Sum_BetweenTwoPaledrome {
	static boolean isPale(int n) {
		int rev=0,m=n;
		while(n>0) {
			rev=(rev*10)+n%10;
			n=n/10;
		}
		return (rev==m);
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Two numbers \n m to n");
		int n=scan.nextInt();
		int m=scan.nextInt();
		
		int sum=0;
		for (int i = n; i <= m; i++) {
			boolean res=isPale(i);
			if(res==true) {
				sum=sum+i;
			}
			System.out.println(sum);
		}
	}
}
