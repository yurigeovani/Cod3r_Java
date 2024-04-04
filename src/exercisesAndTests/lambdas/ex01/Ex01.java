package exercisesAndTests.lambdas.ex01;

class Ex01 {

	public static void main(String[] args) {

		/*
		 * 1. Write a Java program to implement a lambda expression to find the sum of two integers.*/
		
		SumCalc calc = (a,b) -> a+b;
		
		System.out.println(calc.run(23, 22));
	}

}
