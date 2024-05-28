package com.ygtech.cod3r.exercisesAndTests.streams.ex06;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

class Ex06 {

	public static void main(String[] args) {

		/*
		 * 6. Write a Java program to sort a list of strings in alphabetical order, ascending and descending using streams.
		 * */
		
		List<String> list = Arrays.asList("Maria", "Bruno", "Pedro", "João", "João", "Pedro", "Yuri", "Bia", "Luma", "Bia");

		UnaryOperator<List<String>> ascendingSorter = strList -> strList.stream().sorted().collect(Collectors.toList());
		UnaryOperator<List<String>> descendingSorter = strList -> strList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		List<String>listOrdered = ascendingSorter.apply(list);
		List<String>listUnordered = descendingSorter.apply(list);
		
		System.out.println(listOrdered);
		System.out.println(listUnordered);
	}

}
