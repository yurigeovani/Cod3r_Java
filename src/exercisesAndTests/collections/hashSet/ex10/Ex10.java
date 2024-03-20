package exercisesAndTests.collections.hashSet.ex10;

import java.util.HashSet;

class Ex10 {

	public static void main(String[] args) {

		/*
		 * 10. Write a Java program to compare two hash set.
		 */
		
		HashSet<String> setColors1 = new HashSet<>();
		setColors1.add("Red");
		setColors1.add("Green");
		setColors1.add("Blue");
		setColors1.add("White");
		setColors1.add("Black");
		setColors1.add("Pink");
		
		HashSet<String> setColors2 = new HashSet<>();
		setColors2.add("Red");
		setColors2.add("Green");
		setColors2.add("Blue");
		setColors2.add("White");
		setColors2.add("Black");
		
		System.out.println(setColors1);
		System.out.println(setColors2);
		
		// MY SOLUTION
		//System.out.println(setColors1.equals(setColors2));
		
		for (String color : setColors1) {
			System.out.printf("setColors 2 contains %s? %s\n", color, setColors2.contains(color) ? "Yes" : "No");
		}
	}

}
