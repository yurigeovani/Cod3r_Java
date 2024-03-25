package exercisesAndTests.oo.inheritance.ex09;

class Motorcycle extends Vehicle{

	private static final String MODEL = "Motorcycle";
	private static final double  FUEL_EFFICIENCY = 2.5;

	public Motorcycle() {
		super(MODEL, FUEL_EFFICIENCY);
		// TODO Auto-generated constructor stub
	}

	public Motorcycle(String make, int year, String fuelType) {
		super(make, MODEL, year, fuelType, FUEL_EFFICIENCY);
		// TODO Auto-generated constructor stub
	}

	
}
