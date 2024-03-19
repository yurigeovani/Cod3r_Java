package exercisesAndTests.oo.polymorphism.ex02;

public class Bicycle extends Vehicle {
	@Override
	public void speedUp(double speedIncrease) {
		super.speedUp(speedIncrease*2);
	}
}
