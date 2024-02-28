package hakerrank;

public class Palindrome {
	public static void main(String[] args) {
		int n=10101,rev=0,m=n;
		while (n>0) {
		    rev=rev*10+n%10;
			n=n/10;
		}
		System.out.println(m==rev?"Pal":"not Pal");
	}
}
