package exercisesAndTests.lambdas.ex06;

import java.util.Arrays;
import java.util.List;

class Ex06 {

	public static void main(String[] args) {

		/*
		 * 6. Write a Java program to implement a lambda expression to find the average of a list of doubles.
		 * */
		
		Numbers numbers = new Average();
		List<Double> num = Arrays.asList(3.5, 7.5, 4.3, 4.7, 5.1);
		
		System.out.println(numbers.run(num));

		Numbers numbersW3 = new Average();
		System.out.println(numbersW3.run(num));
	}

}
