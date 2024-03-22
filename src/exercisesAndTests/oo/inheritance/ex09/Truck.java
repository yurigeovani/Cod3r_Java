package exercisesAndTests.oo.inheritance.ex09;

class Truck extends Vehicle{
	
	private static String model = "Truck";
	private static double  fuelEfficiency = 40;

	public Truck() {
		super(model, fuelEfficiency);
		// TODO Auto-generated constructor stub
	}

	public Truck(String make, int year, String fuelType) {
		super(make, model, year, fuelType, fuelEfficiency);
		// TODO Auto-generated constructor stub
	}


}
