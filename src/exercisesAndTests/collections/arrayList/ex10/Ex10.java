package exercisesAndTests.collections.arrayList.ex10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex10 {

	public static void main(String[] args) {

		/*
		 * 10. Write a Java program to shuffle elements in a array list.
		 */
		
		List<String> listColors = new ArrayList<>();
		listColors.add("Red");
		listColors.add("Green");
		listColors.add("Blue");
		listColors.add("White");
		listColors.add("Black");
		
		System.out.println("Unshuffle list " + listColors);
		Collections.shuffle(listColors);
		System.out.println("Shuffle list " + listColors);
		
	}

}
