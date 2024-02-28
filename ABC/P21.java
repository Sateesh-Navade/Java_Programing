package ABC;

//WAP to remove all lowercase consonants from a given input string
public class P21 {
	public static void main(String[] args) {
		String s = "APPLEapple";// APPLEae
		String t="";
		
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c>='a'&&c<='z') {
				if(c=='a'||c=='e'||c=='o'||c=='i'||c=='u') {
					t=t+c;
				}
			}else
				t=t+c;
		}
		System.out.println(t);
	}
}
