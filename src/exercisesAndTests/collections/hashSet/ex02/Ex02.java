package exercisesAndTests.collections.hashSet.ex02;

import java.util.HashSet;
import java.util.Iterator;

public class Ex02 {

	public static void main(String[] args) {

		/*
		 * 2. Write a Java program to iterate through all elements in a hash list.
		 */
		
		HashSet<String> setColors = new HashSet<>();
		setColors.add("Red");
		setColors.add("Green");
		setColors.add("Blue");
		setColors.add("White");
		setColors.add("Black");
		
		/* MY SOLUTION
		for (String color : setColors) {
			System.out.println(color);
		}
		*/
		
		Iterator<String> i = setColors.iterator();
		
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
