package com.ygtech.cod3r.exercisesAndTests.oo.encapsulation.ex05;

class Ex05 {

	public static void main(String[] args) {

		/*
		 * 5. Write a Java program to create a class called Circle with a private instance variable radius.
		 * Provide public getter and setter methods to access and modify the radius variable.
		 * However, provide two methods called calculateArea() and calculatePerimeter() that return the calculated area and perimeter based on the current radius value.
		 */
		
		Circle c1 = new Circle();
		c1.setRadius(7);
		System.out.println("Area: " + String.format("%.2f", c1.calculateArea()));
		System.out.println("Area: " + String.format("%.2f", c1.calculatePerimeter()));
		
		Circle c2 = new Circle(7);
		System.out.println("Area: " + String.format("%.2f", c2.calculateArea()));
		System.out.println("Area: " + String.format("%.2f", c2.calculatePerimeter()));
		
		Circle c3 = new Circle();
		System.out.println("Area: " + String.format("%.2f", c3.calculateArea(7)));
		System.out.println("Area: " + String.format("%.2f", c3.calculatePerimeter(7)));
		
	}
}
