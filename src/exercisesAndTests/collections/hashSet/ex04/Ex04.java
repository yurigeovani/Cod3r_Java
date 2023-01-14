package exercisesAndTests.collections.hashSet.ex04;

import java.util.HashSet;

public class Ex04 {

	public static void main(String[] args) {

		/*
		 * 4. Write a Java program to empty an hash set.
		 */
		
		HashSet<String> setColors = new HashSet<>();
		setColors.add("Red");
		setColors.add("Green");
		setColors.add("Blue");
		setColors.add("Black");
		setColors.add("White");
		setColors.add("Purple");
		
		System.out.println(setColors);
		setColors.removeAll(setColors);
		System.out.println(setColors);
		
	}

}
