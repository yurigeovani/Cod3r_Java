package exercisesAndTests.collections.linkedList.ex08;

import java.util.LinkedList;

public class Ex08 {

	public static void main(String[] args) {

		/*
		 * 8. Write a Java program to insert the specified element at the end of a linked list.
		 */
		
		LinkedList<String> listColors = new LinkedList<>();
		listColors.add("Red");
		listColors.add("Green");
		listColors.add("Blue");
		listColors.add("White");
		listColors.add("Black");
		
		System.out.println(listColors);
		listColors.offerLast("Gray");
		System.out.println(listColors);
		
	}

}
