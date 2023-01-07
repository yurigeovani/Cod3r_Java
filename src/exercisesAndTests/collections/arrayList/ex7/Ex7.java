package exercisesAndTests.collections.arrayList.ex7;

import java.util.ArrayList;
import java.util.List;

public class Ex7 {

	public static void main(String[] args) {

		/*
		 * 7. Write a Java program to search an element in a array list.
		 */
		
		List<String> listColors = new ArrayList<>();
		listColors.add("Red");
		listColors.add("Blue");
		listColors.add("Green");
		listColors.add("White");
		listColors.add("Black");
		System.out.println(listColors);
		
		if(listColors.contains("White"))
			System.out.println(true);
		else
			System.out.println("There is no such element.");
	}

}
