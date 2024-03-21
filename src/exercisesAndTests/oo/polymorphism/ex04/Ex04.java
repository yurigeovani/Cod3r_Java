package exercisesAndTests.oo.polymorphism.ex04;

class Ex04 {

	public static void main(String[] args) {

		/*
		 * 4. Write a Java program to create a class Employee with a method called calculateSalary().
		 * Create two subclasses Manager and Programmer. In each subclass, override the calculateSalary() method to calculate
		 * and return the salary based on their specific roles.
		 * */

		Manager manager = new Manager("Yuri", 1200);
		Programmer programmer = new Programmer ("Luma", 1000);
		
		System.out.println(manager.calculateSalary());
		System.out.println(programmer.calculateSalary());
		
	}

}
