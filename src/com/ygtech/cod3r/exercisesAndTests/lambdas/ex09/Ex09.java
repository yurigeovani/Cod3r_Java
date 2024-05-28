package com.ygtech.cod3r.exercisesAndTests.lambdas.ex09;

import java.util.Arrays;
import java.util.List;

class Ex09 {

	public static void main(String[] args) {

		/*
		 * 9. Write a Java program to implement a lambda expression to create a lambda expression to check if a number is prime.
		 * */
		
		Number num = new PrimeNumber();
		
		
		System.out.println(num.run(-5));
		
		List<Integer> nums = Arrays.asList(1,2,3,5,6,7,9,10,11,14,13,17);
		
		nums.forEach(t -> {
			System.out.println(t + " " + num.run(t));
		});
		
	}

}
