package com.ygtech.cod3r.exercisesAndTests.collections.treeSet.ex09;

import java.util.TreeSet;

class Ex09 {

	public static void main(String[] args) {

		/*
		 * 9. Write a Java program to find the numbers less than 7 in a tree set.
		 */
		
		TreeSet<Integer> treeNumbers = new TreeSet<>();
		treeNumbers.add(8);
		treeNumbers.add(5);
		treeNumbers.add(2);
		treeNumbers.add(7);
		treeNumbers.add(10);
		
		System.out.println("Full tree: " + treeNumbers);
		
//		MY SOLUTION
//		for (Integer number : treeNumbers) {
//			if(number < 7) System.out.println(number);
//		}
		
		TreeSet<Integer> treeheadset = new TreeSet<>();
		treeheadset = (TreeSet<Integer>)treeNumbers.headSet(7);
		
		System.out.println(treeheadset);
	}

}
