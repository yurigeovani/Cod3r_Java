package com.ygtech.cod3r.exercisesAndTests.interfaces.ex01;

class Circle implements Shape{

	private double radius;
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public Circle() {
		super();
	}
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return (Math.pow(getRadius(), 2))*Math.PI;
	}

}
