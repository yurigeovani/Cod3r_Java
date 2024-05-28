package com.ygtech.cod3r.exercisesAndTests.collections.hashSet.ex01;

import java.util.HashSet;

class Ex01 {

	public static void main(String[] args) {

		/*
		 * 1. Write a Java program to append the specified element to the end of a hash set.
		 * */
		
		HashSet<String> colors = new HashSet<String>();
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		
		System.out.println(colors);
		
		colors.add("Black");
		colors.add("White");

		System.out.println(colors);
	}

}
