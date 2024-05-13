package exercisesAndTests.streams.ex07;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Ex07 {

	public static void main(String[] args) {

		/*
		 * 7. Write a Java program to find the maximum and minimum values in a list of integers using streams.
		 * */
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 9, 8, 23, -23, 99, 13, -10);
		
		Comparator<Integer> getter = (num1, num2) -> {
			if(num1 > num2) return 1;
			if(num2 > num1) return -1;
			return 0;
		};
		
		int maxNumber1 = list.stream().max(getter).get();
		int minNumber1 = list.stream().min(getter).get();
		
		System.out.println("Max: " + maxNumber1);
		System.out.println("Min: " + minNumber1);
		
		
		//W3 solution
		int maxNumber2 = list.stream().max(Integer::compare).orElse(null);
		int minNumber2 = list.stream().min(Integer::compare).orElse(null);
		
		System.out.println("Max: " + maxNumber2);
		System.out.println("Min: " + minNumber2);
		
		
		
	}

}
