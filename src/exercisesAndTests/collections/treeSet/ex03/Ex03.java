package exercisesAndTests.collections.treeSet.ex03;

import java.util.TreeSet;

public class Ex03 {

	public static void main(String[] args) {

		/*
		 * 3. Write a Java program to add all the elements of a specified tree set to another tree set.
		 */
		
		TreeSet<String> treeColors = new TreeSet<>();
		treeColors.add("Red");
		treeColors.add("Green");
		treeColors.add("Blue");
		treeColors.add("White");
		treeColors.add("Black");
		
		TreeSet<String> newTreeColors = new TreeSet<>();
		newTreeColors.add("Pink");
		newTreeColors.addAll(treeColors);
		
		System.out.println(newTreeColors);
	}

}
