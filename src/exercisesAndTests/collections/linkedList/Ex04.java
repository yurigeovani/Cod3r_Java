package exercisesAndTests.collections.linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Ex04 {
    public static void main(String[] args) {
        
        /* 4. Write a Java program to iterate a linked list in reverse order. */

        LinkedList<String> listColors = new LinkedList<>();

        listColors.add("Red");
        listColors.add("Green");
        listColors.add("Blue");
        listColors.add("Black");
        listColors.add("White");

        Iterator<String> i = listColors.descendingIterator();

        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
