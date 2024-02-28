package ABC;

//Remove vowels in a string
public class P14 {
	public static void main(String[] args) {
		String s = "Apple"; // ppl
		s=s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c!='a'&&c!='e'&&c!='i'&&c!='o'&&c!='u')
			System.out.println(c);
		}
	}
}
