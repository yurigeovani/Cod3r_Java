package exercisesAndTests.collections.treeSet.ex02;

//import java.util.Iterator;
import java.util.TreeSet;

public class Ex02 {

	public static void main(String[] args) {
		
		/*
		 * 2. Write a Java program to iterate through all elements in a tree set
		 */
		
		TreeSet<String> treeColors = new TreeSet<>();
		treeColors.add("Red");
		treeColors.add("Green");
		treeColors.add("Blue");
		treeColors.add("White");
		treeColors.add("Black");

//		MY SOLUTION
//		Iterator<String> i = treeColors.iterator();
//		
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
		
		for (String color : treeColors) {
			System.out.println(color);
		}
	}

}
