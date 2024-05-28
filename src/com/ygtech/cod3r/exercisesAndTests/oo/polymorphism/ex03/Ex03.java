package com.ygtech.cod3r.exercisesAndTests.oo.polymorphism.ex03;

class Ex03 {

	public static void main(String[] args) {

		/*3. Write a Java program to create a base class Shape with a method called calculateArea(). 
		 * Create three subclasses: Circle, Rectangle, and Triangle. Override the calculateArea() method in each subclass to calculate and return the shape's area.
		 */
		
		Circle circle = new Circle(10);
		System.out.println(circle.roundArea(1234.12341234));
		//System.out.println(circle.roundArea(12.335));
		System.out.println(circle.calculateArea());
		
		Rectangle rectangle = new Rectangle(10, 15);
		System.out.println(rectangle.calculateArea());
		
		Triangle triangle = new Triangle(17,19);
		System.out.println(triangle.calculateArea());
	}
}
