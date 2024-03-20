package exercisesAndTests.collections.hashSet;

import java.util.HashSet;

class Ex03 {
    public static void main(String[] args) {
        
        /* 3. Write a Java program to get the number of elements in a hash set. */

        HashSet<String> listColors = new HashSet<>();

        listColors.add("Red");
        listColors.add("Green");
        listColors.add("Blue");
        listColors.add("Black");
        listColors.add("White");
        
        System.out.println(listColors.size());
    }
}
