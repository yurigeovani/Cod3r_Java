package exercisesAndTests.collections.hashSet.ex07;

import java.util.HashSet;
//import java.util.Iterator;

class Ex07 {

	public static void main(String[] args) {

		/*
		 * 7. Write a Java program to convert a hash set to an array.
		 */
		
		HashSet<String> setColors = new HashSet<>();
		setColors.add("Red");
		setColors.add("Green");
		setColors.add("Blue");
		setColors.add("White");
		setColors.add("Black");
		
		System.out.println(setColors);

		String[] arrayColors = new String[setColors.size()];
		
//		MY SOLUTION
//		Iterator<String> i = setColors.iterator();
//		int j = 0;
//		
//		while(i.hasNext()) {
//			arrayColors[j] = i.next();
//			j++;
//		}
		
		setColors.toArray(arrayColors);
		for (String color : arrayColors) {
			System.out.println(color);
		}
		
	}

}
