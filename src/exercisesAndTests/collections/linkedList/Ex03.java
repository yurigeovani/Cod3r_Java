package exercisesAndTests.collections.linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Ex03 {
    public static void main(String[] args) {
        
        /* 3. Write a Java program to iterate through all elements in a linked list 
        starting at the specified position.*/

        LinkedList<String> listColors = new LinkedList<>();

        listColors.add("Red");
        listColors.add("Green");
        listColors.add("Blue");
        listColors.add("Black");
        listColors.add("White");

        Iterator<String> i = listColors.listIterator();

        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
