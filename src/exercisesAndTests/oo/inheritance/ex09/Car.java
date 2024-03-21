package exercisesAndTests.oo.inheritance.ex09;

class Car extends Vehicle{

	public Car() {
		super();
	}

	public Car(String make, int year, String fuelType) {
		super(make, "Car", year, fuelType, 6);
	}
}
