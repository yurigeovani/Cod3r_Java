package exercisesAndTests.collections.treeSet;

import java.util.Iterator;
import java.util.TreeSet;


public class Ex02 {
    public static void main(String[] args) {
        
        /* 2. Write a Java program to iterate through all elements in a tree set. */

        TreeSet<String> listColors = new TreeSet<>();

        listColors.add("Red");
        listColors.add("Green");
        listColors.add("Blue");
        listColors.add("Black");
        listColors.add("White");

        // My solution
        Iterator<String> i = listColors.iterator();

        while (i.hasNext()) {
            System.out.println(i.next());
        }
        // end my solution

        for (String color : listColors) {
            System.out.println(color);
        }
    }
}
