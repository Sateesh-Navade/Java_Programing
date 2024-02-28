package ABC;

//WAP to remove all lowercase vowels from a input string
public class P19 {
	public static void main(String[] args) {
		String s = "APPLEapple";// APPLEppl
		for (int i = 0; i < s.length(); i++) {
			char c=s.charAt(i);
			if(c!='a'&&c!='e'&&c!='i'&&c!='o'&&c!='u')
			System.out.print(s.charAt(i));
		}
	}
}
