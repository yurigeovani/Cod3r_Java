package com.ygtech.cod3r.exercisesAndTests.collections.linkedList.ex06;

import java.util.LinkedList;

class Ex06 {

	public static void main(String[] args) {

		/*
		 * 6. Write a Java program to insert elements into the linked list at the first and last position.
		 */
		
		LinkedList<String> listColors = new LinkedList<>();
		listColors.add("Red");
		listColors.add("Green");
		listColors.add("Blue");
		listColors.add("White");
		listColors.add("Black");

		System.out.println(listColors);
		/* My solution
		listColors.add(0, "Yellow");
		listColors.add("Pink");
		System.out.println(listColors);
		*/
		
		listColors.addFirst("Yellow");
		listColors.addLast("Pink");
		System.out.println(listColors);
	}

}
