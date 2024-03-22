package exercisesAndTests.oo.inheritance.ex09;

class Car extends Vehicle{

	private static String model = "Car";
	private static double  fuelEfficiency = 6;

	public Car() {
		super(model, fuelEfficiency);
		// TODO Auto-generated constructor stub
	}

	public Car(String make, int year, String fuelType) {
		super(make, model, year, fuelType, fuelEfficiency);
		// TODO Auto-generated constructor stub
	}
	
	
}
