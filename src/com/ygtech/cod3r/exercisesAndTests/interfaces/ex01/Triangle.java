package com.ygtech.cod3r.exercisesAndTests.interfaces.ex01;

class Triangle implements Shape{
	
	private double base;
	private double height;
	
	
	
	public Triangle() {
		super();
	}



	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}



	public double getBase() {
		return base;
	}



	public void setBase(double base) {
		this.base = base;
	}



	public double getHeight() {
		return height;
	}



	public void setHeight(double height) {
		this.height = height;
	}



	@Override
	public double getArea() {
		return (getBase()*getHeight())/2;
	}

}
