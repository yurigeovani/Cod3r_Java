package com.ygtech.cod3r.exercisesAndTests.oo.polymorphism.ex03;

class Circle extends Shape{
	
	private double radius;
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	@Override
	public double calculateArea() {
		return roundArea(((Math.pow(getRadius(), 2))*Math.PI));
		//return Math.pow(getRadius(), 2)*Math.PI;
	}
}
