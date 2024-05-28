package com.ygtech.cod3r.exercisesAndTests.collections.treeSet.ex07;

import java.util.TreeSet;

class Ex07 {

	public static void main(String[] args) {

		/*
		 * 7. Write a Java program to get the number of elements in a tree set.
		 */
		
		TreeSet<String> treeColors = new TreeSet<>();
		treeColors.add("Red");
		treeColors.add("Green");
		treeColors.add("Blue");
		treeColors.add("White");
		treeColors.add("Black");
		
		System.out.println(treeColors.size());

	}

}
