package ABC;
//convert all vowels to uppercase
public class P59 {
	public static void main(String[] args) {
		String s="apple";//o/p=ApplE
		s=s.toLowerCase();
		String rs="";
		for (int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c>='a'&&c<='z') 
			{
				if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
					c=(char) (c-32);
					rs=rs+c;
				}else
					rs=rs+c;
			}
		}
		System.out.println(rs);
	}
}
