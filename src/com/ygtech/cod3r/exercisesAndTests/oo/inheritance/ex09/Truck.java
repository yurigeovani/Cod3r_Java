package com.ygtech.cod3r.exercisesAndTests.oo.inheritance.ex09;

class Truck extends Vehicle{
	
	private static final String MODEL = "Truck";
	private static final double  FUEL_EFFICIENCY = 40;

	public Truck() {
		super(MODEL, FUEL_EFFICIENCY);
		// TODO Auto-generated constructor stub
	}

	public Truck(String make, int year, String fuelType) {
		super(make, MODEL, year, fuelType, FUEL_EFFICIENCY);
		// TODO Auto-generated constructor stub
	}


}
