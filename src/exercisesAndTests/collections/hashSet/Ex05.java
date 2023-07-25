package exercisesAndTests.collections.hashSet;

import java.util.HashSet;

public class Ex05 {
    public static void main(String[] args) {

        /* 5. Write a Java program to test if a hash set is empty or not. */

        HashSet<String> listColors = new HashSet<>();

        listColors.add("");
        listColors.add("Green");
        listColors.add("Blue");
        listColors.add("Black");
        listColors.add("White");

        // My solution
        if (listColors.size() == 0)
            System.out.println("Hashset is empty!");
        else
            System.out.println(listColors);


        if(listColors.isEmpty())
            System.out.println("Is empty!");
        else
            System.out.println(listColors);


        listColors.removeAll(listColors);

        if(listColors.isEmpty())
            System.out.println("Is empty!");
        else
            System.out.println(listColors);

    }
}