package exercisesAndTests.collections.linkedList;

import java.util.LinkedList;

class Ex05 {
    public static void main(String[] args) {
        
        /* 5. Write a Java program to insert the specified element at the specified position in the linked list.*/

        LinkedList<String> listColors = new LinkedList<>();

        listColors.add("Red");
        listColors.add("Green");
        listColors.add("Blue");
        listColors.add("Black");
        listColors.add("White");

        System.out.println("Before insert: " + listColors);
        listColors.set(1, "Pink");
        System.out.println("After insert: " + listColors);
    }
}
