package hakerrank;

import java.util.Scanner;

public class XylemOrPylem {
	static String isXylem(int n){
		int ls=0,ms=0;
		ls=n%10;
		n=n/10;
		while (n>9) {
			ms=ms+n%10;
			n=n/10;
		}
		ls=ls+n;
		return (ls==ms?"Xylem":"Pylem");
	}
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter no");
		int n=scan.nextInt();
		//System.out.println(isXylem(n)?"Xylem":"Pylem");
	System.out.println(isXylem(n));
	}
}
