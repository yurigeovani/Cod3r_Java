package exercisesAndTests.collections.arrayList.ex01;

import java.util.ArrayList;
import java.util.List;

class Ex01 {

	public static void main(String[] args) {

		/*
		 * 1. Write a Java program to create an array list, add some colors (strings) and print out the collection.
		 * */
		
		List<String> colors = new ArrayList<String>();
		
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		colors.add("Black");
		colors.add("White");
		
		System.out.println(colors);
	}

}
