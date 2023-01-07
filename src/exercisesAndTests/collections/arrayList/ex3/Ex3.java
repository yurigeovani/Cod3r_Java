package exercisesAndTests.collections.arrayList.ex3;

import java.util.ArrayList;
import java.util.List;

public class Ex3 {

	public static void main(String[] args) {

		/*
		 * 3. Write a Java program to insert an element into the array list at the first position.
		 */

		List<String> listColors = new ArrayList<>();
		
		listColors.add("Red");
		listColors.add("Green");
		listColors.add("Orange");
		listColors.add("White");
		listColors.add("Black");
		
		System.out.println(listColors.size());
		System.out.println(listColors);

		listColors.add(0, "Pink");
		listColors.add(5, "Yellow");
		
		System.out.println(listColors);
	}

}
