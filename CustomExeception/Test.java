package CustomExeception;

class InvalidAgeException extends Exception {
	
}
public class Test {
	public static void main(String[] args) {
		try {
			validate(23);
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}
	}

	public static void validate(int age) throws InvalidAgeException {
		if (age<18) {
			throw new InvalidAgeException();
		} else {
			System.out.println("Wellcome To Voteings");
		}
	}
}
