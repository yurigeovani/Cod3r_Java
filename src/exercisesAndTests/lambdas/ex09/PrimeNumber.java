package exercisesAndTests.lambdas.ex09;

public class PrimeNumber implements Number {

	@Override
	public boolean run(int number) {

		int index = number;
		int count = 0;
		
		while (index>0) {
			if(number%index==0) {
				count++;
			}
			index--;
		}
		
		if(count==2) {
			return true;
		} else {
			return false;
		}
	}
}
