package com.ygtech.cod3r.exercisesAndTests.lambdas.ex11;

import java.util.Comparator;
import java.util.List;

class MaxFinder implements Finder {

	@Override
	public int run(List<Integer> numbers) {

		numbers.sort(Comparator.reverseOrder());
		
		return numbers.get(0);
	}
}
