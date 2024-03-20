package exercisesAndTests.collections.hashSet;

import java.util.HashSet;
import java.util.Iterator;

class Ex02 {
    public static void main(String[] args) {

        /* 2. Write a Java program to iterate through all elements in a hash list. */

        HashSet<String> listColors = new HashSet<>();

        listColors.add("Red");
        listColors.add("Green");
        listColors.add("Blue");
        listColors.add("Black");
        listColors.add("White");

        // SOLUÇÃO 1
        /* for (String color : listColors) {
            System.out.println(color);
        } */

        // SOLUÇÃO 2
        Iterator<String> i = listColors.iterator();

        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
