package exercisesAndTests.oo.inheritance.ex09;

//Implement methods for calculating fuel efficiency, distance traveled, and maximum speed
abstract class Vehicle {
	private String make;
	private String model;
	private int year;
	private String fuelType;
	private double fuelEfficiency;

	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public double getFuelEfficiency() {
		return fuelEfficiency;
	}
	public void setFuelEfficiency(double fuelEfficiency) {
		this.fuelEfficiency = fuelEfficiency;
	}
	
	public Vehicle(String make, String model, int year, String fuelType, double fuelEfficiency) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.fuelType = fuelType;
		this.fuelEfficiency = fuelEfficiency;
	}
	public Vehicle() {
		super();
	}
	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", model=" + model + ", year=" + year + ", fuelType=" + fuelType + ", fuelEfficiency=" + fuelEfficiency + "]";
	}
}
