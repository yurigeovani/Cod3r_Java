package com.ygtech.cod3r.exercisesAndTests.lambdas.ex02;

import java.util.function.Predicate;

class Ex02 {

	public static void main(String[] args) {
		
		/*
		 * 2. Write a Java program to implement a lambda expression to check if a given string is empty.
		 * */
		
		Predicate<String> verify = str -> str.isEmpty();

		System.out.println(verify.test(""));
		System.out.println(verify.test("Aasdf"));
		System.out.println(verify.test(" 12"));
	}

}
