package exercisesAndTests.collections.hashSet.ex06;

import java.util.HashSet;

class Ex06 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		/*
		 * 6. Write a Java program to clone a hash set to another hash set.
		 */
		
		HashSet<String> setColors = new HashSet<String>();
		setColors.add("Red");
		setColors.add("Green");
		setColors.add("Blue");
		setColors.add("Black");
		setColors.add("White");
		System.out.println(setColors);
		
		HashSet<String> setCloneColors = new HashSet<>();
		System.out.println(setCloneColors);
		
		setCloneColors = (HashSet<String>)setColors.clone();
		System.out.println(setCloneColors);
		
	}

}
