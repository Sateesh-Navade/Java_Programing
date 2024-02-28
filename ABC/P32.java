package ABC;
//count all consonants from the given input string
public class P32 {
	public static void main(String[] args) {
		String s="Apple";//o/p=3
		s=s.toLowerCase();
		int count =0;
		for (int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c!='a'&&c!='e'&&c!='i'&&c!='o'&&c!='u') {
				count++;
			}
		}
		System.out.println(count);
	}
}
