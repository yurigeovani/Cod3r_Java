package com.ygtech.cod3r.exercisesAndTests.collections.arrayList.ex09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Ex09 {

	public static void main(String[] args) {

		/*
		 * 9. Write a Java program to copy one array list into another.
		 */
		
		List<String> listColors = new ArrayList<>();
		listColors.add("Red");
		listColors.add("Green");
		listColors.add("Blue");
		listColors.add("White");
		listColors.add("Black");
		
		List<String> listColorsCopy1 = new ArrayList<>();
		listColorsCopy1 = listColors;
		System.out.println(listColors == listColorsCopy1);
		
		List<String> listColorsCopy2 = new ArrayList<>();
		listColorsCopy2.add(null);
		listColorsCopy2.add(null);
		listColorsCopy2.add(null);
		listColorsCopy2.add(null);
		listColorsCopy2.add(null);

		Collections.copy(listColorsCopy2, listColors);
		System.out.println(listColorsCopy2);
	}

}
