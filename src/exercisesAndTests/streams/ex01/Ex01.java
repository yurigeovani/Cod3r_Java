package exercisesAndTests.streams.ex01;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

class Ex01 {

	public static void main(String[] args) {

		/*
		 * 1. Write a Java program to calculate the average of a list of integers using streams.
		 * */
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		// My solution
		BinaryOperator<Integer> soma = (a, b) -> (a+b);
		double media = list.stream().reduce(soma).get()/list.size();
		System.out.println(media);
		
		// W3 Solution
		double avg = list.stream()
									.mapToDouble(Integer::doubleValue)
									.average()
									.orElse(0.0);
		
		System.out.println(avg);
	}

}
