package com.ygtech.cod3r.exercisesAndTests.collections.arrayList.ex02;

import java.util.ArrayList;
import java.util.List;

class Ex02 {

	public static void main(String[] args) {

		/*
		 * 2. Write a Java program to iterate through all elements in an array list.
		 * */
		
		List<String> colors = new ArrayList<String>();
		
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		colors.add("Black");
		colors.add("White");
		
		
		for (String color : colors) {
			System.out.println("Color " + color);
		}
	}

}
