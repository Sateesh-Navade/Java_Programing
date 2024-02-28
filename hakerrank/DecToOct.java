package hakerrank;

import java.util.Scanner;

public class DecToOct {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter decimal value");
		int no = sc.nextInt();
		String bin = "";
		String s = decToOct(no);
		System.out.println("Equivalent Octal is " + s);
	}

	static String decToOct(int no) {
		String oct = "";
		while (no != 0) {
			int rem = no % 8;     //16 for HexaDecimal
			oct = rem + oct;
			no = no / 8;         //16 for HexaDecimal
		}
		return oct;
	}
}
