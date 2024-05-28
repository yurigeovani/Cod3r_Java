package com.ygtech.cod3r.exercisesAndTests.lambdas.ex11;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class Ex11 {

	public static void main(String[] args) {

		/*
		 * 11. Write a Java program to implement a lambda expression to find the maximum and minimum values in a list of integers.
		 * */
		
		Finder maxFinder = new MaxFinder();
		Finder minFinder = new MinFinder();
		
		List<Integer> numbers = Arrays.asList(3, 5,2, 4, -9,8, 1);
		
		System.out.println(maxFinder.run(numbers));
		System.out.println(minFinder.run(numbers));
		
		// w3 resolution
		Optional<Integer> max = numbers
				.stream()
				.max((x,y) -> x.compareTo(y));
		System.out.println(max.orElse(null));
		
		Optional<Integer> min = numbers
				.stream()
				.min((x,y) -> x.compareTo(y));
		System.out.println(min.orElse(null));
		
		
	}

}
