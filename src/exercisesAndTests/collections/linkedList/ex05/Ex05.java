package exercisesAndTests.collections.linkedList.ex05;

import java.util.LinkedList;

public class Ex05 {

	public static void main(String[] args) {

		/*
		 * 5. Write a Java program to insert the specified element at the specified position in the linked list.
		 */
		
		LinkedList<String> listColors = new LinkedList<>();
		listColors.add("Red");
		listColors.add("Green");
		listColors.add("Blue");
		listColors.add("White");
		listColors.add("Black");
		
		
		System.out.println(listColors);
		
		listColors.add(2, "Yellow");
		
		System.out.println(listColors);
		
	}

}
