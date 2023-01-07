package exercisesAndTests.collections.arrayList.ex1;

import java.util.ArrayList;
import java.util.List;

public class Ex1 {

	public static void main(String[] args) {

		/*
		 * Write a Java program to create a new array list, add some colors (string) and
		 * print out the collection.
		 */

		List<String> listColors = new ArrayList<>();

		listColors.add("Red");
		listColors.add("Green");
		listColors.add("Orange");
		listColors.add("White");
		listColors.add("Black");

		System.out.println(listColors);
	}

}
