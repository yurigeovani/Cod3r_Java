package com.ygtech.cod3r.exercisesAndTests.collections.hashSet.ex02;

import java.util.HashSet;
import java.util.Iterator;

class Ex02 {

	public static void main(String[] args) {

		/*
		 * 2. Write a Java program to iterate through all elements in a hash list.*/
		
		HashSet<String> colors = new HashSet<String>();
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		colors.add("Black");
		colors.add("White");
		
		for (Iterator<String> i = colors.iterator(); i.hasNext();) {
			System.out.println(i.next());
		}
		
		Iterator<String> it = colors.iterator();
		while (it .hasNext()) {
			System.out.println(it.next());
		}
	}

}
