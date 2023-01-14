package exercisesAndTests.collections.hashSet.ex03;

import java.util.HashSet;

public class Ex03 {

	public static void main(String[] args) {

		/*
		 * 3. Write a Java program to get the number of elements in a hash set.
		 */
		
		HashSet<String> setColors = new HashSet<>();
		setColors.add("Red");
		setColors.add("Green");
		setColors.add("Blue");
		setColors.add("White");
		setColors.add("Black");
		
		System.out.println(setColors.size());
	}

}
