package exercisesAndTests.lambdas.ex05;

import java.util.Arrays;
import java.util.List;

class Ex05 {

	public static void main(String[] args) {

		/*
		 * 5. Write a Java program to implement a lambda expression to sort a list of strings in alphabetical order.
		 * */
		
		Sorter sorter = new AlphabeticalOrder();
		
		List<String> strings = Arrays.asList("Write","a","Java","program","to","implement","a","lambda","expression","to","sort","a","list","of","strings","in","alphabetical","order");

		System.out.println(strings);
		
		sorter.run(strings);

		System.out.println(strings);
		
	}
}
