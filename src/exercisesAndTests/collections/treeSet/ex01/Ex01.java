package exercisesAndTests.collections.treeSet.ex01;

import java.util.TreeSet;

public class Ex01 {

	public static void main(String[] args) {

		/*
		 * 1. Write a Java program to create a new tree set, add some colors (string) and print out the tree set.
		 */
		
		TreeSet<String> treeColors = new TreeSet<>();
		treeColors.add("Red");
		treeColors.add("Green");
		treeColors.add("Blue");
		treeColors.add("Black");
		treeColors.add("White");
		
		System.out.println(treeColors);
	}

}
