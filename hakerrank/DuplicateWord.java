package hakerrank;

import java.util.Arrays;

public class DuplicateWord {
	public static void main(String[] args) {
		String string = "Big black big bug big bit Black dog big";
		string = string.toLowerCase();
		String w[] = string.split(" ");
//		System.out.println(Arrays.toString(w));
		for (int i = 0; i < w.length; i++) {
			int count=1;
			for (int j = i + 1; j < w.length; j++) {
				if (w[i].equals(w[j])) {
					count++;
					w[j]="0";
				}
			}
			if(count>1&&w[i]!="0") {
				System.out.println(w[i]+"-->"+count);
			}
		}
	}
}
