package com.ygtech.cod3r.exercisesAndTests.lambdas.ex14;

import java.util.Arrays;
import java.util.function.Predicate;

class Ex14 {

	public static void main(String[] args) {

		/*
		 * 14. Write a Java program to implement a lambda expression to check if a given string is a palindrome.
		 * */
		
		// My solution 1
		Predicate<String> str = t -> {
			
			char [] word = t.toCharArray();
			char [] reverseWord = new char[word.length];
			for (int i = word.length; i >0 ; i--) {
				reverseWord[reverseWord.length-i] = word[i-1];
			}

			if(Arrays.toString(word).equals(Arrays.toString(reverseWord)))
				return true;
			return false;
			};
			
			String word = "mussum";
			System.out.println(str.test(word));
			
			// My solution 2
			Checker test2 = new Palindrome();
			System.out.println(test2.run(word));
			
			// W3 solution
			Checker test3 = new PalindromeW3();
			System.out.println(test3.run(word));
	}

}
