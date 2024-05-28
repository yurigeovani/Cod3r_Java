package com.ygtech.cod3r.exercisesAndTests.oo.polymorphism.ex02;

class Car extends Vehicle{
	@Override
	public void speedUp(double speedIncrease) {
		super.speedUp(speedIncrease*10);
	}
}
