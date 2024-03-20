package exercisesAndTests.collections.hashSet.ex08;

import java.util.HashSet;
import java.util.TreeSet;

class Ex08 {

	public static void main(String[] args) {

		/*
		 * 8. Write a Java program to convert a hash set to a tree set.
		 */
		
		HashSet<String> setColors = new HashSet<>();
		setColors.add("Red");
		setColors.add("Green");
		setColors.add("Blue");
		setColors.add("White");
		setColors.add("Black");
		
//		MY SOLUTION
//		TreeSet<String> treeColors = new TreeSet<>();
//		treeColors.addAll(setColors);
		
		TreeSet<String> treeColors = new TreeSet<>(setColors);
		for (String color : treeColors) {
			System.out.println(color);
		}
	}

}
