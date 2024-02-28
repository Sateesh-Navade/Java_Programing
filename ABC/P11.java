package ABC;

public class P11 {
	public static void main(String[] args) {
		String s = "ABCDE";// ABEDC
	
		for (int i = s.length()-1; i >= s.length()/2; i--) {
			System.out.print(s.charAt(i));         //Modifyy it
		}
	}
}
