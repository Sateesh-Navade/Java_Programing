package ABC;

public class P5 {
	public static void main(String[] args) {
		String s="hello"; //olh
		
			for (int i = s.length()-1; i >= 0; i--) {
				if (i%2==0) {
					System.out.print(s.charAt(i));
				}
			}
	}
}

