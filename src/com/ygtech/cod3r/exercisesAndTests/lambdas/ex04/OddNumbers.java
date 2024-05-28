package com.ygtech.cod3r.exercisesAndTests.lambdas.ex04;

import java.util.List;
import java.util.stream.Collectors;

class OddNumbers implements Filter{

	@Override
	public List<Integer> run(List<Integer> numbers) {
		return numbers
				.stream()
				.filter(num -> num%2 != 0)
				.collect(Collectors.toList());
	}
}
