package exercisesAndTests.collections.arrayList.ex5;

import java.util.ArrayList;
import java.util.List;

public class Ex5 {

	public static void main(String[] args) {

		/*
		 * 5. Write a Java program to update specific array element by given element.
		 */
		
		List<String> listColors = new ArrayList<>();
		listColors.add("Red");
		listColors.add("Blue");
		listColors.add("Green");
		listColors.add("White");
		listColors.add("Black");
		System.out.println(listColors);
		
		listColors.set(3, listColors.get(4));
		System.out.println(listColors);
		
		listColors.set(4, "White");
		System.out.println(listColors);		
	}

}
