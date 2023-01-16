package exercisesAndTests.collections.treeSet.ex05;

import java.util.TreeSet;

public class Ex05 {

	public static void main(String[] args) {

		/*
		 * 5. Write a Java program to get the first and last elements in a tree set.
		 */
		
		TreeSet<String> treeColors = new TreeSet<>();
		treeColors.add("Red");
		treeColors.add("Green");
		treeColors.add("Blue");
		treeColors.add("White");
		treeColors.add("Black");
		
		System.out.println(treeColors.first());
		System.out.println(treeColors.last());

	}

}
