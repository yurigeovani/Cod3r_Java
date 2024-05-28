package com.ygtech.cod3r.exercisesAndTests.lambdas.ex12;

import java.util.Arrays;
import java.util.List;

class Ex12 {

	public static void main(String[] args) {

		/*
		 * 12. Write a Java program to create a lambda expression to multiply and sum all elements in a list of integers.
		 * */
		
		Numbers mul =  new Multiply();
		Numbers sum =  new Sum();
		List<Integer> nums = Arrays.asList(12, 15, 2, 8, 7, 9, -6);
		
		// My solution
		System.out.println(mul.run(nums));
		System.out.println(sum.run(nums));
		
		
		//W3 solution
		int mult = nums
				.stream()
				.reduce(1, (x,y) -> x*y)
				.intValue();
		
		int sum1 = nums
				.stream()
				.reduce(0, (x, y) -> x+y)
				.intValue();
		
		//or 
		int sum2 = nums
				.stream()
				.reduce(0, Integer::sum)
				.intValue();
		
		System.out.println(mult);
		System.out.println(sum1);
		System.out.println(sum2);
		
	}

}
