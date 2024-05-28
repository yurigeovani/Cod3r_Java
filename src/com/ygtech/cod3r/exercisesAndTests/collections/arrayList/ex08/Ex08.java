package com.ygtech.cod3r.exercisesAndTests.collections.arrayList.ex08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Ex08 {

	public static void main(String[] args) {

		/*
		 * 8. Write a Java program to sort a given array list.
		 */
		
		List<String> listColors = new ArrayList<>();
		listColors.add("Red");
		listColors.add("Blue");
		listColors.add("Green");
		listColors.add("White");
		listColors.add("Black");
		
		System.out.println("Unsorted list: " + listColors);
		
		Collections.sort(listColors);
		System.out.println("Sorted list: " + listColors);
	}

}
