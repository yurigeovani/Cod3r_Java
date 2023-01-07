package exercisesAndTests.collections.arrayList.ex4;

import java.util.ArrayList;
import java.util.List;

public class Ex4 {

	public static void main(String[] args) {

		/*
		 * 4. Write a Java program to retrieve an element (at a specified index) from a given array list.
		 */
		
		List<String> listColors = new ArrayList<>();
		
		listColors.add("Red");
		listColors.add("Green");
		listColors.add("Orange");
		listColors.add("White");
		listColors.add("Black");
		
		System.out.println(listColors.get(3));
		
		String element = listColors.get(0);
		System.out.println("First element: " + element);
		
		element = listColors.get(2);
		System.out.println("Third element: " + element);
		
	}

}
