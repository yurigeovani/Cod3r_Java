package exercisesAndTests.collections.treeSet;

import java.util.TreeSet;

class Ex05 {
    public static void main(String[] args) {
        
        /* 5. Write a Java program to get the first and last elements in a tree set. */

        TreeSet<String> listColors = new TreeSet<>();

        listColors.add("Red");
        listColors.add("Green");
        listColors.add("Blue");
        listColors.add("Black");
        listColors.add("White");

        System.out.println("First: " + listColors.first());
        System.out.println("Last: " + listColors.last());
    }
}
