package exercisesAndTests.lambdas.ex01;

import java.util.function.BinaryOperator;

class Ex01 {

	public static void main(String[] args) {

		/*
		 * 1. Write a Java program to implement a lambda expression to find the sum of two integers.
		 * */
		
		BinaryOperator<Integer> sum = (a, b) -> a+b;
		
		System.out.println(sum.apply(2,7));
		System.out.println(sum.apply(22,-71));
	}

}
