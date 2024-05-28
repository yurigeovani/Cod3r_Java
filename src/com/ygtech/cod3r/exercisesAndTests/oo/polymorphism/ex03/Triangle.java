package com.ygtech.cod3r.exercisesAndTests.oo.polymorphism.ex03;

class Triangle extends Shape{

	private double base;
	private double heigth;
	
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getHeigth() {
		return heigth;
	}
	public void setHeigth(double heigth) {
		this.heigth = heigth;
	}

	public Triangle(double base, double heigth) {
		super();
		this.base = base;
		this.heigth = heigth;
	}
	
	@Override
	public double calculateArea() {
		return roundArea((getBase()*getHeigth())/2);
	}
}
