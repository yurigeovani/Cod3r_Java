package exercisesAndTests.collections.linkedList.ex10;

import java.util.LinkedList;

class Ex10 {

	public static void main(String[] args) {

		/*
		 * 10. Write a Java program to get the first and last occurrence of the specified elements in a linked list.
		 */
		
		LinkedList<String> listColors = new LinkedList<>();
		listColors.add("Red");
		listColors.add("Green");
		listColors.add("Blue");
		listColors.add("White");
		listColors.add("Black");
		
		System.out.println(listColors.getFirst());
		System.out.println(listColors.getLast());
	}

}
