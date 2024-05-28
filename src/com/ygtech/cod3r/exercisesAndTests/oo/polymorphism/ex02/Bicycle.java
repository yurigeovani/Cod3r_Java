package com.ygtech.cod3r.exercisesAndTests.oo.polymorphism.ex02;

class Bicycle extends Vehicle {
	@Override
	public void speedUp(double speedIncrease) {
		super.speedUp(speedIncrease*2);
	}
}
