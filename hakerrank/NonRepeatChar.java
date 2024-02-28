package hakerrank;

//0/p=l e b
public class NonRepeatChar {
	public static void main(String[] args) {
		String s1 = "apple", s2 = "banana";
		String s3 = s1.toLowerCase() + s2.toLowerCase();

		System.out.println(s3);
		char[] c = s3.toCharArray();
		boolean[] arr = new boolean[s3.length()];   
		for (int i = 0; i < c.length; i++) {
			int count = 0;
			if (arr[i] == false) {
				for (int j = i ; j < c.length; j++) {
					if (c[i] == c[j]) {
						count++;
						arr[j] = true;
					}
				}
				if(count==1)
					System.out.println(c[i]);
			}
			
		}
	}
}
