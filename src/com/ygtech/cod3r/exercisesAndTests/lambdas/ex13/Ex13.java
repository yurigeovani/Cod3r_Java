package com.ygtech.cod3r.exercisesAndTests.lambdas.ex13;

class Ex13 {

	public static void main(String[] args) {

		/*
		 * 13. Write a Java program to implement a lambda expression to count words in a sentence.
		 * */
		
		Counter counter = new WordCounter();
		
			String text = "Java lambda expression.";
			System.out.println(counter.run(text));

			text = "The quick brown fox jumps over the lazy dog.";
			System.out.println(counter.run(text));

			text = "  Ola!    Eu sou Goku         ";
			System.out.println(counter.run(text));
	}

}
