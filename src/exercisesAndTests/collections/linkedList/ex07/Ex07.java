package exercisesAndTests.collections.linkedList.ex07;

import java.util.LinkedList;

class Ex07 {

	public static void main(String[] args) {

		/*
		 * 7. Write a Java program to insert the specified element at the front of a linked list.
		 */
		
		LinkedList<String> listColors = new LinkedList<>();
		listColors.add("Red");
		listColors.add("Green");
		listColors.add("Blue");
		listColors.add("White");
		listColors.add("Black");
		
		System.out.println(listColors);
		listColors.addFirst("Gray"); // when the addition fails, return exception
		listColors.offerFirst("Yellow"); // when the addition fails, return false
		
		System.out.println(listColors);
	}

}
