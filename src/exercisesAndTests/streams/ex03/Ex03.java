package exercisesAndTests.streams.ex03;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

class Ex03 {

	public static void main(String[] args) {

		/*
		 * 3. Write a Java program to calculate the sum of all even, odd numbers in a list using streams.
		 * */
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 14);
		
		Predicate<Integer> evenNumbers = n -> n%2==0;
		Predicate<Integer> oddNumbers = evenNumbers.negate();
		BinaryOperator<Integer> sum = (a, b) -> a + b;
		
		int evenSum = list.stream()
			.filter(evenNumbers)
			.reduce(sum)
			.get();		
		System.out.println("Sum of even numbers: " + evenSum);
		
		int oddSum = list.stream()
				.filter(oddNumbers)
				.reduce(sum)
				.get();		
		System.out.println("Sum of odd numbers: " + oddSum);
		
		// W3 Solutions
		
		int evenSumW3 = list.stream()
				.filter(evenNumbers)
				.mapToInt(Integer::intValue)
				.sum();
		System.out.println("Sum of even numbers: " + evenSumW3);
		
		int oddSumW3 = list.stream()
				.filter(oddNumbers)
				.mapToInt(Integer::intValue)
				.sum();
		System.out.println("Sum of odd numbers: " + oddSumW3);
		
		
	}

}
