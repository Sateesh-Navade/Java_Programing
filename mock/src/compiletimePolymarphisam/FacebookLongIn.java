package compiletimePolymarphisam;

public class FacebookLongIn {
	
	
	
	public String longIn(String email,String password) {
		return "logged in with Email";
	}
	public String longIn(long phone,String password) {
		return ("logged in with Phone");
	}
	public static void main(String[] args) {
		FacebookLongIn f=new FacebookLongIn();
		
		System.out.println(f.longIn(99998888, "abc123"));
		System.out.println(f.longIn("abc@gmail.com", "abc123"));
	}
}
