package abstraction;

interface Car {
	void drive();
	void applyingBreck();
}

 class Vehicle implements Car{

	@Override
	public void drive() {
		System.out.println("Driving a Car");
	}

	@Override
	public void applyingBreck() {
		System.out.println("Applying Breck");
	}
}

 public class Main{
	 public static void main(String[] args) {
		Vehicle v=new Vehicle();
		v.drive();
		v.applyingBreck();
	}
 }
