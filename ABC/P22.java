package ABC;

//WAP to remove all uppercase consonants from a given input string
public class P22 {
	public static void main(String[] args) {
		String s = "APPLEapple";// AEapple
		String r="";
		for (int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c>='A'&&c<='Z')
			{
				if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
					r=r+c;
			}
			else
				r=r+c;
		}
		System.out.println(r);
		
	}
}
