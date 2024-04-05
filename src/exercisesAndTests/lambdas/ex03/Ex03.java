package exercisesAndTests.lambdas.ex03;

import java.util.Arrays;
import java.util.List;

class Ex03 {

	public static void main(String[] args) {

		/*
		 * 3. Write a Java program to implement a lambda expression to convert a list of strings to uppercase and lowercase.
		 * */
		
		Convert toUpper = new ToUpper();
		
		List<String> down = Arrays.asList("maria", "PEDRO", "jOAo");
		
		System.out.println(down);

		
		System.out.println(down);
	}
}
