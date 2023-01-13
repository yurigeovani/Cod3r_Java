package exercisesAndTests.collections.linkedList.ex03;

import java.util.Iterator;
import java.util.LinkedList;

public class Ex03 {

	public static void main(String[] args) {

		/*
		 * 3. Write a Java program to iterate through all elements in a linked list starting at the specified position
		 */
		
		LinkedList<String> listColor = new LinkedList<>();
		listColor.add("Red");
		listColor.add("Green");
		listColor.add("Blue");
		listColor.add("Yellow");
		listColor.add("White");
		listColor.add("Black");

		Iterator<String> i = listColor.listIterator(5);
		
		while(i.hasNext())
				System.out.println(i.next());

	}

}
