package com.ygtech.cod3r.exercisesAndTests.streams.ex02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Ex02 {

	public static void main(String[] args) {

		/*
		 * 2. Write a Java program to convert a list of strings to uppercase or lowercase using streams.
		 * */
		
		List<String> list = Arrays.asList( "red", "green", "blue");
		
		List<String> upperList = list.stream()
													.map(String::toUpperCase)
													.collect(Collectors.toList());
		
		System.out.println(upperList);
	}

}
