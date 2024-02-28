package testing;

public class A {
	public static void main(String[] args) {
		String s="a3b2c5";//aaabbc
		for (int i = 0; i < s.length(); i++) {
			if(i%2==0) {
				for (int j = 0; j < s.charAt(i+1)-48; j++) {					
					System.out.print(s.charAt(i));
				}
			}
		}
	}
}
