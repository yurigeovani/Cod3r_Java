package exercisesAndTests.collections.hashSet.ex01;

import java.util.HashSet;

public class Ex01 {

	public static void main(String[] args) {

		/*
		 * 1. Write a Java program to append the specified element to the end of a hash set. 
		 */
		
		HashSet<String> setColors = new HashSet<>();
		setColors.add("Red");
		setColors.add("Green");
		setColors.add("Blue");
		setColors.add("White");
		setColors.add("Black");
		
		System.out.println(setColors);
	}

}
