package exercisesAndTests.collections.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Ex04 {
    public static void main(String[] args) {

        /* 4. Write a Java program to retrieve an element (at a specified index) from a given array list. */

        List<String> listColors = new ArrayList<>();

        listColors.add("Red");
        listColors.add("Green");
        listColors.add("Blue");
        listColors.add("Black");
        listColors.add("White");

        System.out.println(listColors.get(1));
    }
}
