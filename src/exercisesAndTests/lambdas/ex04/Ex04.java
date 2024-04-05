package exercisesAndTests.lambdas.ex04;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Ex04 {

	public static void main(String[] args) {

		/*
		 * 4. Write a Java program to implement a lambda expression to filter out even and odd numbers from a list of integers.*/
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Filter even numbers using lambda expression
        List<Integer> evenNumbers = filterNumbers(numbers, n -> n % 2 == 0);

        // Filter odd numbers using lambda expression
        List<Integer> oddNumbers = filterNumbers(numbers, n -> n % 2 != 0);

        System.out.println("Even Numbers: " + evenNumbers);
        System.out.println("Odd Numbers: " + oddNumbers);

	}
	
	public static List<Integer> filterNumbers(List<Integer> numbers, Predicate<Integer> predicate) {
				
        return numbers.stream()
                      .filter(predicate)
                      .collect(Collectors.toList());
    }
}
