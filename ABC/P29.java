package ABC;
//count all lowercase aplhabets in a given string
public class P29 {
	public static void main(String[] args) {
		String s = "APple";//o/p=3
		int c=0;
		for (int i=0;i<s.length();i++) {
			if(s.charAt(i)>='a'&&s.charAt(i)<='z') {    //if(s.charAt(i)>='A'&&s.charAt(i)<='Z')   for Uppercase count
				c++;
			}
		}
		System.out.println("count of lowercase aplhabets :"+c);
	}
}
