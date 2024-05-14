package exercisesAndTests.streams.ex08;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Ex08 {

	public static void main(String[] args) {

		/*
		 * 8. Write a Java program to find the second smallest and largest elements in a list of integers using streams.
		 * */
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 14);
		
		int secondLargest = list.stream()
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList())
				.get(1);
		
		int secondSmallest = list.stream()
				.sorted()
				.collect(Collectors.toList())
				.get(1);
		
		System.out.println("Second largest: " + secondLargest);
		System.out.println("Second smallest: " + secondSmallest);
		
		// W3 Solution
		int secondLargestW3 = list.stream()
				.distinct()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst()
				.orElse(null);
		
		int secondSmallestW3 = list.stream()
				.distinct()
				.sorted()
				.skip(1)
				.findFirst()
				.orElse(null);

		System.out.println("Second largest: " + secondLargestW3);
		System.out.println("Second smallest: " + secondSmallestW3);
	}

}
