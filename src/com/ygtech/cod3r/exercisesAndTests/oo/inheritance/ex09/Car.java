package com.ygtech.cod3r.exercisesAndTests.oo.inheritance.ex09;

class Car extends Vehicle{

	private static final String MODEL = "Car";
	private static final double  FUEL_EFFICIENCY = 6;

	public Car() {
		super(MODEL, FUEL_EFFICIENCY);
		// TODO Auto-generated constructor stub
	}

	public Car(String make, int year, String fuelType) {
		super(make, MODEL, year, fuelType, FUEL_EFFICIENCY);
		// TODO Auto-generated constructor stub
	}
	
	
}
