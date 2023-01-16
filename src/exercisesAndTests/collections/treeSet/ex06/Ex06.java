package exercisesAndTests.collections.treeSet.ex06;

import java.util.TreeSet;

public class Ex06 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		/*
		 * 6. Write a Java program to clone a tree set list to another tree set.
		 */
		
		TreeSet<String> treeColors1 = new TreeSet<>();
		treeColors1.add("Red");
		treeColors1.add("Green");
		treeColors1.add("Blue");
		treeColors1.add("White");
		treeColors1.add("Black");

		TreeSet<String> treeColors2 = (TreeSet<String>)treeColors1.clone();
		
		System.out.println(treeColors2);

	}

}
