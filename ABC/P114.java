package ABC;

import java.util.Arrays;

//remove duplicates from the given array?
public class P114 {
	public static void main(String[] args) {
		int []arr= {1,2,3,2,1,4};//[3 4]
		String re = "";
		boolean[] r = new boolean[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			if (r[i] == false) {
				int c=1;
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
						r[j]=true;
						c++;
					}		
				}
				if(c==1) 
				re = re + arr[i];
			}
		}
		System.out.println(Arrays.toString(re.toCharArray()));

	}
}
