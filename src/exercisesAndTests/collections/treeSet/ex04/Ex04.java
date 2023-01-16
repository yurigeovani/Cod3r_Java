package exercisesAndTests.collections.treeSet.ex04;

import java.util.Iterator;
import java.util.TreeSet;

public class Ex04 {

	public static void main(String[] args) {

		/*
		 * 4. Write a Java program to create a reverse order view of the elements contained in a given tree set.
		 */
		
		TreeSet<String> treeColors = new TreeSet<>();
		treeColors.add("Red");
		treeColors.add("Green");
		treeColors.add("Blue");
		treeColors.add("White");
		treeColors.add("Black");
		
		Iterator<String> i = treeColors.descendingIterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
