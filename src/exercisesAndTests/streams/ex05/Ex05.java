package exercisesAndTests.streams.ex05;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Ex05 {

	public static void main(String[] args) {

		/*
		 * 5. Write a Java program to count the number of strings in a list that start with a specific letter using streams.
		 * */
		
		List<String> list = Arrays.asList("Maria", "Bruno", "Pedro", "João", "João", "Pedro", "Yuri", "Bia", "Luma", "Bia");

		Predicate<String> startsWith = a -> a.startsWith("B");
		
		long counter = 
		list.stream()
			.filter(startsWith)
			.count();
		
		System.out.println(counter);
		
		
	}

}
