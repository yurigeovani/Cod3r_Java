package exercisesAndTests.collections.arrayList.ex06;

import java.util.ArrayList;
import java.util.List;

public class Ex06 {

	public static void main(String[] args) {

		/*
		 * 6. Write a Java program to remove the third element from a array list.
		 * */
		
		List<String> listColors = new ArrayList<>();
		
		listColors.add("Red");
		listColors.add("Blue");
		listColors.add("Green");
		listColors.add("White");
		listColors.add("Black");
		System.out.println(listColors);
		
		listColors.remove(2);
		
		System.out.println(listColors);

	}

}
