package ABC;

//WAP to remove all uppercase characters in a given string
public class P16 {
	public static void main(String[] args) {
		String s = "dfSeEkJJUu";// o/p=dfeku

		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)>='a'&&s.charAt(i)<='z')
			System.out.print(s.charAt(i));
		}
	}
}
