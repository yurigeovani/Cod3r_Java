package exercisesAndTests.lambdas.ex06;

import java.util.Iterator;
import java.util.List;

class Average implements Numbers {

	@Override
	public Double run(List<Double> nums) {
		double average = 0;
		int index = 0;
		
		Iterator<Double> it = nums.iterator();
		while (it.hasNext()) {
			average+=it.next();
			index++;
		}

		average = average/index;

		return average;
	}

}
