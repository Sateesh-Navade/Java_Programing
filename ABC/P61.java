package ABC;
//convert all all vowels to lowercase and consonants to uppercsae
public class P61 {
	public static void main(String[] args) {
		String s="apple";//o/p=aPPLe
		s=s.toUpperCase();
		String r="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			 if(c>='a'&&c<='z'||c>='A'&&c<='Z') {
				 if(c=='A'||c=='E'||c=='O'||c=='I'||c=='U') {
					 c=(char) (c+32);
					 r=r+c;
				 }else {
					 r=r+c;
				 }
			 }
		}
		System.out.println(r);
	}
}
