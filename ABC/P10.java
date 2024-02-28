package ABC;

public class P10 {
	public static void main(String[] args) {
		String s="ABCDkoo";//c
		
		
		if(s.length()%2!=0)
		System.out.println(s.charAt(s.length()/2));
		else {
			System.out.println(s.charAt(s.length()/2-1)+""+s.charAt(s.length()/2));
		}
	}
}
