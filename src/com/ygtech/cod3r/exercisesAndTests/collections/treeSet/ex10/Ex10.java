package com.ygtech.cod3r.exercisesAndTests.collections.treeSet.ex10;

import java.util.TreeSet;

class Ex10 {

	public static void main(String[] args) {

		/*
		 * 10. Write a Java program to get the element in a tree set which is greater than or equal to the given element.
		 */
		
		TreeSet<Integer> treeNumbers = new TreeSet<>();
		treeNumbers.add(2);
		treeNumbers.add(22);
		treeNumbers.add(12);
		treeNumbers.add(8);
		treeNumbers.add(10);
		
		System.out.println(treeNumbers.ceiling(13));
	}

}
