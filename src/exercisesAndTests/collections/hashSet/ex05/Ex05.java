package exercisesAndTests.collections.hashSet.ex05;

import java.util.HashSet;

public class Ex05 {

	public static void main(String[] args) {

		/*
		 * 5. Write a Java program to test a hash set is empty or not.
		 */
		
		HashSet<String> setColors = new HashSet<>();
		setColors.add("Red");
		setColors.add("Green");
		setColors.add("Blue");
		setColors.add("White");
		setColors.add("Black");

//		MY SOLUTION		
//		if(setColors.isEmpty())
//			System.out.println("Empty");
//		else
//			System.out.println("No empty");
		
		System.out.println(setColors.isEmpty());
		
		setColors.removeAll(setColors);
		System.out.println(setColors.isEmpty());
	}

}
