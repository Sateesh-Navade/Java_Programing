package ABC;

//Remove All Lowercase Alphabets in a String
public class P15 {
	public static void main(String[] args) {
		String s = "SatEesH"; // o/p= SEH
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)>='A'&&s.charAt(i)<='Z')
			System.out.println(s.charAt(i));
		}
	}
}
