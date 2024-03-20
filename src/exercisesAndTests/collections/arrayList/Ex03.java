package exercisesAndTests.collections.arrayList;

import java.util.ArrayList;
import java.util.List;

class Ex03 {
    public static void main(String[] args) {

        /* 3. Write a Java program to insert an element into the array list at the first position. */

        List<String> listColors = new ArrayList<>();
        listColors.add("Red");
        listColors.add("Green");
        listColors.add("Blue");
        listColors.add("Black");
        listColors.add("White");

        System.out.println(listColors.size());
        System.out.println(listColors);

        listColors.add(0, "Pink");

        System.out.println(listColors);
    }
}
