package ABC;
//count all numeric characters from a given input String
public class P31 {
	public static void main(String[] args) {
		String s="abc@123";//o/p=3
		int c=0;
		for (int i=0;i<s.length();i++) {
			if(s.charAt(i)>='1'&&s.charAt(i)<='9')
				c++;
		}
		System.out.println(c);
	}
}
