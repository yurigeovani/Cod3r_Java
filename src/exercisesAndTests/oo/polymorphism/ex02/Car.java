package exercisesAndTests.oo.polymorphism.ex02;

public class Car extends Vehicle{
	@Override
	public void speedUp(double speedIncrease) {
		super.speedUp(speedIncrease*10);
	}
}
