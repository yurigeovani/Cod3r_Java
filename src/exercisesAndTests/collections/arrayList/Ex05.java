package exercisesAndTests.collections.arrayList;

import java.util.ArrayList;
import java.util.List;

class Ex05 {
    public static void main(String[] args) {

        /* 5. Write a Java program to update an array element by the given element. */

        List<String> listColors = new ArrayList<>();

        listColors.add("Red");
        listColors.add("Green");
        listColors.add("Blue");
        listColors.add("Black");
        listColors.add("White");

        System.out.println("Before edit: " + listColors);
        
        listColors.set(0, "Pink");
        System.out.println("After edit: " + listColors);
    }
}
