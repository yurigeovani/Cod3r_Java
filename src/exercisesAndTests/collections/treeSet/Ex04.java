package exercisesAndTests.collections.treeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class Ex04 {
    public static void main(String[] args) {

        /*
         * 4. Write a Java program to create a reverse order view of the elements contained in a given tree set.
         */

        TreeSet<String> listColors = new TreeSet<>();

        listColors.add("Red");
        listColors.add("Green");
        listColors.add("Blue");
        listColors.add("Black");
        listColors.add("White");

        Iterator<String> i = listColors.iterator();

        // Original order
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        
        // Reverse order
        Iterator<String> j = listColors.descendingIterator();
        while (j.hasNext()) {
            System.out.println(j.next());
        }
    }
}
