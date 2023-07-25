package exercisesAndTests.collections.treeSet;

import java.util.TreeSet;

public class Ex01 {
    public static void main(String[] args) {

        /* 1. Write a Java program to create a tree set, add some colors (strings) and print out the tree set. */

        TreeSet<String> listColors = new TreeSet<>();

        listColors.add("Red");
        listColors.add("Green");
        listColors.add("Blue");
        listColors.add("Black");
        listColors.add("White");

        System.out.println(listColors);
    }
}
