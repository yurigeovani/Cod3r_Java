package exercisesAndTests.oo.inheritance.ex09;

class Motorcycle extends Vehicle{

	private static String model = "Motorcycle";
	private static double  fuelEfficiency = 2.5;

	public Motorcycle() {
		super(model, fuelEfficiency);
		// TODO Auto-generated constructor stub
	}

	public Motorcycle(String make, int year, String fuelType) {
		super(make, model, year, fuelType, fuelEfficiency);
		// TODO Auto-generated constructor stub
	}

	
}
