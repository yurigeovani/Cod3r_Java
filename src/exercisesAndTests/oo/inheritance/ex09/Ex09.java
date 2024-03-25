package exercisesAndTests.oo.inheritance.ex09;

class Ex09 {

	public static void main(String[] args) {

		/*
		 * 9. Write a Java program to create a vehicle class hierarchy. The base class should be Vehicle, with subclasses Truck, Car and Motorcycle. 
		 * Each subclass should have properties such as make, model, year, and fuel type. Implement methods for calculating fuel efficiency, distance traveled, and maximum speed.
		 * */
		
		Truck t1 = new Truck("AA", 1990, "Diesel");
		System.out.println(t1.toString());
		
		Truck t2 = new Truck();
		t2.setMake("BB");
		t2.setYear(1990);
		t2.setFuelType("Diesel");
		System.out.println(t2.toString());
		
		Car c1 = new Car("CC", 2010, "Gasoline");
		System.out.println(c1.toString());
		
		Motorcycle m1 = new Motorcycle("MM", 2019, "Electric");
		System.out.println(m1.toString());
	}
}
