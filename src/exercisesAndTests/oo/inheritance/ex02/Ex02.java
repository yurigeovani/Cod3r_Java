package exercisesAndTests.oo.inheritance.ex02;

class Ex02 {

	public static void main(String[] args) {

		/*
		 * 2. Write a Java program to create a class called Vehicle with a method called drive(). 
		 * Create a subclass called Car that overrides the drive() method to print "Repairing a car".*/
		
		Vehicle vehicle = new Vehicle();
		Car car = new Car();
		
		vehicle.drive();
		car.drive();
		
	}
}
