package exercisesAndTests.lambdas.ex06;

import java.util.List;

class AverageW3 implements Numbers {

	@Override
	public Double run(List<Double> nums) {

		double average = nums.stream()
				.mapToDouble(Double::doubleValue)
				.average()
				.orElse(0.00);
		return average;
	}

}
