package exercisesAndTests.lambdas.ex02;

import java.util.function.Predicate;

class Ex02 {

	public static void main(String[] args) {
		
		/*
		 * 2. Write a Java program to implement a lambda expression to check if a given string is empty.
		 * */
		
		Predicate<String> verifier = str -> str.isEmpty();
		
		String text1 = "Abcd";
		String text2 = "";
		String text3 = " 123";
		
		System.out.println(verifier.test(text1));
		System.out.println(verifier.test(text2));
		System.out.println(verifier.test(text3));
	}
}
