package hakerrank;

public class DecToBin {
	public static void main(String[] args) {
		int n=10;
		String s="";
		while (n!=0) {
			int r= n%2;
			s=s+r;
			n=n/2;
		}
		System.out.println(s);
	}
}
