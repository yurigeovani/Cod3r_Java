package com.ygtech.cod3r.exercisesAndTests.collections.hashSet.ex09;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Ex09 {

	public static void main(String[] args) {

		/*
		 * 9. Write a Java program to convert a hash set to a List/ArrayList.
		 */
		
		HashSet<String> setColors = new HashSet<>();
		setColors.add("Red");
		setColors.add("Green");
		setColors.add("Blue");
		setColors.add("White");
		setColors.add("Black");
		
		List<String> listColors = new ArrayList<>(setColors);
		
		System.out.println(listColors);
		
	}

}
