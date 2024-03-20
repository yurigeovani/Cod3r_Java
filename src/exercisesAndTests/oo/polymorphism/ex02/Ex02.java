package exercisesAndTests.oo.polymorphism.ex02;

class Ex02 {

	public static void main(String[] args) {

		/*2. Write a Java program to create a class Vehicle with a method called speedUp().
		 * Create two subclasses Car and Bicycle. Override the speedUp() method in each subclass to increase the vehicle's speed differently.
		 */
		
		Car car = new Car();
		Bicycle bike = new Bicycle();

		car.speedUp(1.2);
		bike.speedUp(1.2);

		System.out.println(car.getSpeed());
		System.out.println(bike.getSpeed());

		car.speedUp(5);
		bike.speedUp(5);
		
		System.out.println(car.getSpeed());
		System.out.println(bike.getSpeed());
	}
}
