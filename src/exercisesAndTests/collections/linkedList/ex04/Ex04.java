package exercisesAndTests.collections.linkedList.ex04;

import java.util.Iterator;
import java.util.LinkedList;

public class Ex04 {

	public static void main(String[] args) {

		/*
		 * 4. Write a Java program to iterate a linked list in reverse order.
		 */
		
		LinkedList<String> listColors = new LinkedList<>();
		listColors.add("Red");
		listColors.add("Green");
		listColors.add("Blue");
		listColors.add("White");
		listColors.add("Black");
		listColors.add("Purple");
		
		// My solution
//		int i = listColors.size()-1;
//		
//		while (i>=0) {
//			System.out.println(listColors.get(i));
//			i--;
//		}
		
		Iterator<String> i = listColors.descendingIterator();
		while(i.hasNext())
			System.out.println(i.next());
	}

}
