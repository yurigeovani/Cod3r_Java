package exercisesAndTests.oo.inheritance.ex09;

class Motorcycle extends Vehicle{

	public Motorcycle() {
		super();
	}

	public Motorcycle(String make, int year, String fuelType) {
		super(make, "Motorcycle", year, fuelType, 2.5);
	}
}
