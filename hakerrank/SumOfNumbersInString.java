package hakerrank;

public class SumOfNumbersInString {
	public static void main(String[] args) {
		String s = "s1a2t3e4e5s6h7"; // o/p=28
		int sum=0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)>='1'&&s.charAt(i)<='9') {
				sum=sum+s.charAt(i)-48;
				System.out.print(s.charAt(i));
			}
		}
		System.out.println();
		System.out.println("Sum :"+(sum));
		
	}
}
