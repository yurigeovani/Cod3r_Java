package com.ygtech.cod3r.exercisesAndTests.lambdas.ex13;

class WordCounter implements Counter {

	@Override
	public int run(String string) {
		int count = string
				.trim()
				.split("\\s+")
				.length;
		return count;
	}
}
