package MultipleInharitence;


interface Car {
	void startCar();
}

interface Bike {
	void startBike();
}

public class Vehicle implements Car,Bike {

	@Override
	public void startCar() {
		System.out.println("Car is Started");
	}

	@Override
	public void startBike() {
		System.out.println("Bike is Started");
	}
	public static void main(String[] args) {
		Vehicle v= new Vehicle();
		v.startBike();
		v.startCar();
	}
}
