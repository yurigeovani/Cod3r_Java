package com.ygtech.cod3r.exercisesAndTests.oo.polymorphism.ex03;

abstract class Shape {
	double roundArea(double area) {
		return Math.round(area*100)/100.00;
	}

	public double calculateArea() {
		return 0;
	}
}
