package ABC;

//WAP to remove all numeric characters from a given input String
public class P17 {
	public static void main(String[] args) {
		String s = "s1a2t3i4s5h6";// o/p=satish

		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)>='1'&&s.charAt(i)<='9') {
			}
			else
				System.out.print(s.charAt(i));
		}
	}
}
