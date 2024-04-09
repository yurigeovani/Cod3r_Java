package exercisesAndTests.lambdas.ex08;

class Factorial implements Number {

	@Override
	public int run(int number) {
		
			if(number==0) {
				return 1;
			} else {
				for (int i = number-1; i > 0; i--) {
					number*=i;
				}
			}
			return number;
		}

}
