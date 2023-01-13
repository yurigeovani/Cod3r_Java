package exercisesAndTests.collections.arrayList.ex02;

import java.util.ArrayList;
import java.util.List;

public class Ex02 {

	public static void main(String[] args) {

		/*
		 * 2. Write a Java program to iterate through all elements in a array list.
		 */
		
		List<String> listColors = new ArrayList<>();
		
		listColors.add("Red");
		listColors.add("Green");
		listColors.add("Orange");
		listColors.add("White");
		listColors.add("Black");
		
		for (String color : listColors) {
			System.out.println(color);
		}
	}

}
