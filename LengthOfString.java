
public class LengthOfString {
	public static void main(String[] args) {
		String s="arun";
		int i=0;
		
		try {
			while(true) {
				s.charAt(i);
				i++;
			}
		} catch (Exception e) {
			System.out.println(i);
		}
	}
}
