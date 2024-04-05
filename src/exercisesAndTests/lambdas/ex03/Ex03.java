package exercisesAndTests.lambdas.ex03;

import java.util.function.Function;

class Ex03 {

	public static void main(String[] args) {

		/*
		 * 3. Write a Java program to implement a lambda expression to convert a list of strings to uppercase and lowercase.
		 * */
		
		Function<String, String> toUpper = t -> t.toUpperCase(); 
		Function<String, String> toLower = t -> t.toLowerCase();
		
		String lower = "this is a lowcase phrase!";
		String upper = "THIS IS A UPPERCASE PHRASE!";
		
		lower = toUpper.apply(lower);
		upper = toLower.apply(upper);
		
		System.out.println(lower);
		System.out.println(upper);
	}
}
