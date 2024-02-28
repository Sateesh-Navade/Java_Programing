package hakerrank;

import java.util.*;

public class RomanToNumber {
	// This function returns the value of a Roman symbol
	int value(char r) {
		if (r == 'I')
			return 1;
		if (r == 'V')
			return 5;
		if (r == 'X')
			return 10;
		if (r == 'L')
			return 50;
		if (r == 'C')
			return 100;
		if (r == 'D')
			return 500;
		if (r == 'M')
			return 1000;
		return -1;
	}

	// Finds the decimal value of a given Roman numeral
	int romanToDecimal(String str) {                      //MCMIV
		// Initialize result                
		int res = 0;
		for (int i = 0; i < str.length(); i++) {
			// Getting value of symbol s[i]
			int s1 = value(str.charAt(i));               //value(m)  s1=1000
			// Getting value of symbol s[i+1]
			if (i + 1 < str.length()) {
				int s2 = value(str.charAt(i + 1));       //value(c)  s2=100
				// Comparing both values
				if (s1 >= s2) {                           //1000>=100
					// Value of current symbol is greater
					// or equal to the next symbol
					res = res + s1;                         //res=0+1000
				} else {
					// Value of current symbol is less than
					// the next symbol
					res = res + s2 - s1;                     
					i++; // Value of current symbol is
					// less than the next symbol
				}
			} else {
				res = res + s1;
				i++;
			}
		}
		return res;
	}

	// Driver Code
	public static void main(String args[]) {
		RomanToNumber ob = new RomanToNumber();
		// Considering inputs given are valid
		String str = "IV";
		System.out.println("Integer form of Roman Numeral" + " is " + ob.romanToDecimal(str));
	}
}