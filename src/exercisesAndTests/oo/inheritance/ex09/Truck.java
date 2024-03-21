package exercisesAndTests.oo.inheritance.ex09;

class Truck extends Vehicle{
	
	public Truck() {
		super();
	}

	public Truck(String make,  int year, String fuelType) {
		super(make, "Truck", year, fuelType, 30);
	}
}
