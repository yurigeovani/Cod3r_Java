package exercisesAndTests.collections.hashSet;

import java.util.HashSet;

public class Ex04 {
    public static void main(String[] args) {
        
        /* 4. Write a Java program to empty an hash set. */

        HashSet<String> listColors = new HashSet<>();

        listColors.add("Red");
        listColors.add("Green");
        listColors.add("Blue");
        listColors.add("Black");
        listColors.add("White");

        System.out.println(listColors);
        listColors.remove("White"); // Remove by value
        System.out.println(listColors);
        listColors.removeAll(listColors);
        System.out.println(listColors); //remove object
    }
}
