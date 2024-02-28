//vip
public class SumOfNumbersInString {
	public static void main(String[] args) {
		String s="ab12cd24";
		String temp="0";
		int sum=0;
		
		for (int i = 0; i < s.length(); i++) {
			char c=s.charAt(i);
			if(c>='0'&&c<='9') {
				temp+=c;
			}else {
				sum=sum+Integer.parseInt(temp);
				temp="0";
			}
		}
		sum=sum+Integer.parseInt(temp);
		System.out.println(sum);
	}
}
