
public class SumOfIntInString1 {
	public static void main(String[] args) {
		String s="ab12xy24";
		System.out.println(sum(s));
	}

	private static int sum(String s) {
		
		String temp="0";
		int sum=0;
		
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			
			if(Character.isDigit(c)) {
				temp=temp+c;
			}else {
				sum=sum+Integer.parseInt(temp);
				temp="0";
			}
			
		}
		return sum+Integer.parseInt(temp);
	}
}
