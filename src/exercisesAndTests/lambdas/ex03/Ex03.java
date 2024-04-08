package exercisesAndTests.lambdas.ex03;

import java.util.Arrays;
import java.util.List;

class Ex03 {

	public static void main(String[] args) {

		/*
		 * 3. Write a Java program to implement a lambda expression to convert a list of strings to uppercase and lowercase.
		 * */

		Convert toUpper = new ToUpper();
		Convert toLower = new ToLower(); 
		
		List<String> list = Arrays.asList("maria", "PEDRO", "jOÃo", "Yuri", "Thalyta", "Luma");

		toUpper.run(list);
		System.out.println(list);

		toLower.run(list);
		System.out.println(list);
		
		list.replaceAll(t -> t.toUpperCase());
		System.out.println(list);

		list.replaceAll(t -> t.toLowerCase());
		System.out.println(list);
	}
}
