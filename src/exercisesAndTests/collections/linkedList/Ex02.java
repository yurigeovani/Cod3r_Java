package exercisesAndTests.collections.linkedList;

import java.util.LinkedList;

public class Ex02 {
    public static void main(String[] args) {

        /* 2. Write a Java program to iterate through all elements in a linked list.*/

        LinkedList<String> listColors = new LinkedList<>();

        listColors.add("Red");
        listColors.add("Green");
        listColors.add("Blue");
        listColors.add("Black");
        listColors.add("White");

        for (String color : listColors) {
            System.out.println(color);
        }
    }
}
