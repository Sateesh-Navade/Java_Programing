package ABC;

//count extra spaces from a given string
public class P27 {
	public static void main(String[] args) {
		String s = "abc 1  2  3";// o/p=2
		int count = 0;
		for (int i = 0; i < s.length()-1; i++) {
			char c = s.charAt(i);
			if(c==' ')
				if(s.charAt(i+1)==' ')
			count++;
		}
		System.out.println(count);
	}
}
