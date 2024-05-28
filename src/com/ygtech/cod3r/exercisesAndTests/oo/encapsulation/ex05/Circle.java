package com.ygtech.cod3r.exercisesAndTests.oo.encapsulation.ex05;

class Circle {
	/*		 * However, provide two methods called calculateArea() and calculatePerimeter() 
	 * that return the calculated area and perimeter based on the current radius value.*/
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double calculatePerimeter() {
		return 2*Math.PI*getRadius();
	}
	
	public double calculatePerimeter(double radius) {
		this.radius = radius;
		return 2*Math.PI*getRadius();
	}
	
	public double calculateArea() {
		return Math.PI*Math.pow(getRadius(), 2);
	}
	
	public double calculateArea(double radius) {
		this.radius = radius;
		return Math.PI*Math.pow(getRadius(), 2);
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public Circle() {
		super();
	}
}
