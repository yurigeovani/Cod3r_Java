package exercisesAndTests.collections.linkedList.ex09;

import java.util.LinkedList;

class Ex09 {

	public static void main(String[] args) {

		/*
		 * 9. Write a Java program to insert some elements at the specified position into a linked list.
		 */
		
		LinkedList<String> listColors = new LinkedList<>();
		listColors.add("Red");
		listColors.add("Green");
		listColors.add("Yellow");
		listColors.add("White");
		listColors.add("Black");
		
		System.out.println(listColors);

		LinkedList<String> listNewColors = new LinkedList<>();
		listNewColors.add("Blue");
		listNewColors.add("Purple");
		
		System.out.println(listNewColors);
		
		listColors.addAll(2, listNewColors);
		System.out.println(listColors);
		
	}

}
