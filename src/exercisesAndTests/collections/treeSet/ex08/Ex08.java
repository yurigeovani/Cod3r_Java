package exercisesAndTests.collections.treeSet.ex08;

import java.util.TreeSet;

class Ex08 {

	public static void main(String[] args) {

		/*
		 * 8. Write a Java program to compare two tree sets.
		 */
		
		TreeSet<String> treeColors1 = new TreeSet<>();
		treeColors1.add("Red");
		treeColors1.add("Green");
		treeColors1.add("Blue");
		treeColors1.add("White");
		treeColors1.add("Black");
		
		TreeSet<String> treeColors2 = new TreeSet<>();
		treeColors2.add("Red");
		treeColors2.add("Green");
		treeColors2.add("Blue");
		treeColors2.add("White");
		treeColors2.add("Black");
		
		for (String color : treeColors1) {
			System.out.printf("%s: %s\n", color, treeColors2.contains(color) ? true : false);
		}

	}

}
