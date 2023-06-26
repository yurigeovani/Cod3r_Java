package exercisesAndTests.collections.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Ex02 {
    public static void main(String[] args) {

        /* 2. Write a Java program to iterate through all elements in an array list. */

        List<String> listColors = new ArrayList<>();

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
