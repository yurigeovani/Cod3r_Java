package exercisesAndTests.streams.ex04;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Ex04 {

	public static void main(String[] args) {

		/*
		 * 4. Write a Java program to remove all duplicate elements from a list using streams.
		 * */
		
		List<String> list = Arrays.asList("Maria", "Pedro", "João", "João", "Pedro", "Yuri", "Bia", "Luma", "Bia");
		
		List<String> unDuplicatedItems = list.stream().distinct().collect(Collectors.toList());
		
		System.out.println(unDuplicatedItems);
		
	}

}
