package ABC;

//count vowels in a given string
public class P28 {
	public static void main(String[] args) {
		String s = "APple";//o/p=2
		s=s.toLowerCase();
		int count=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				count++;
			}
		}
		System.out.println("count vowels :"+count);
	}
}
