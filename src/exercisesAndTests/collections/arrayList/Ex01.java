package exercisesAndTests.collections.arrayList;

import java.util.ArrayList;
import java.util.List;

class Ex01 {
    public static void main(String[] args) {

        /* 1. Write a Java program to create an array list, add some colors (strings) 
        and print out the collection. */

        List<String> listColors = new ArrayList<>();

        listColors.add("Red");
        listColors.add("Green");
        listColors.add("Blue");
        listColors.add("White");
        listColors.add("Black");

        System.out.println(listColors);

    }
}
