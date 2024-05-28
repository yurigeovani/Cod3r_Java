package com.ygtech.cod3r.exercisesAndTests.lambdas.ex07;

import java.util.Arrays;
import java.util.List;

class Ex07 {

	public static void main(String[] args) {

		/*
		 * 7. Write a Java program to implement a lambda expression to remove duplicates from a list of integers.
		 * */
		
		Numbers numbers = new RemoveDuplicates();
        List<Integer> nums = Arrays.asList(1, 2, 3, 3, 4, 3, 2, 5, 6, 1, 7, 7, 8, 10);

        System.out.println(nums);
        
        System.out.println("Após");
        
        System.out.println(numbers.run(nums));
	}

}
