package ABC;

public class P12 {
	public static void main(String[] args) {
		String s="Abc Def Ghi Jkl";
//		String d="";
//		for (int i = 0; i < s.length(); i++) {
//			char c=s.charAt(i);
//			if(!Character.isWhitespace(c)) {    //whenever space comes this condition becomes false
//				d=d+c;
//			}
//		}
//		System.out.println(d);
		
		
		//2nd method
		String op=s.replace(" ", "");
		System.out.println(op);
	}
}
