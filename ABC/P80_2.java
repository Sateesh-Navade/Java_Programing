package ABC;

import java.util.Arrays;
//refer sdgwgf class
//insert "ABC" in front of every numeric characters from a given input String
public class P80_2 {
	public static void main(String[] args) {
		String s = "apple1230"; // o/p=apple1230ABC
		String r = "";
		char[] c = s.toCharArray();

//		System.out.println(s.toCharArray());          //apple1230
//		System.out.println(Arrays.toString(s.toCharArray()));     //[a, p, p, l, e, 1, 2, 3, 0]

		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] >= '0' && c[i] <= '9') {
					if(c[j] >= '0' && c[j] <= '9') {
						r=r+c[i]+"ABC";
					}else
						r=r+c[i];
				}
			}
		}
	}
}
