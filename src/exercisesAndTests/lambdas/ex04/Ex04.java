package exercisesAndTests.lambdas.ex04;

import java.util.Arrays;
import java.util.List;

class Ex04 {

	public static void main(String[] args) {

		/*
		 * 4. Write a Java program to implement a lambda expression to filter out even and odd numbers from a list of integers.*/
		
		Filter oddNumbers = new OddNumbers();
		Filter evenNumbers = new EvenNumbers();

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
		
		System.out.println(oddNumbers.run(numbers));
		
		System.out.println(evenNumbers.run(numbers));
		
		
	}
}
