package exercisesAndTests.lambdas.ex10;

import java.util.function.BiFunction;

class Ex10 {

	public static void main(String[] args) {

		/*
		 * 10. Write a Java program to implement a lambda expression to concatenate two strings.
		 * */
		
		//My Resolution
		BiFunction<String, String, String> str = (str1, str2) -> {
			String concat = str1 + str2;
			return concat;
		};
		
		System.out.println(str.apply("Yuri", "Geovani"));
		
		//W3 resolution
		BiFunction<String, String, String> concatenate = (str1, str2) -> str1+str2;
		System.out.println(concatenate.apply("Yuri", "Geovani"));
	}
}
