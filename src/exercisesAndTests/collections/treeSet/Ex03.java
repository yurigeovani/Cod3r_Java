package exercisesAndTests.collections.treeSet;

import java.util.TreeSet;

class Ex03 {
    public static void main(String[] args) {
        
        /* 3. Write a Java program to add all the elements of a specified tree set to another tree set. */

        TreeSet<String> listColors1 = new TreeSet<>();
        listColors1.add("Red");
        listColors1.add("Green");
        listColors1.add("Blue");
        listColors1.add("Black");
        listColors1.add("White");

        System.out.println(listColors1);
        TreeSet<String> listColors2 = new TreeSet<>();
        listColors2.addAll(listColors1);
        System.out.println(listColors2);
        
        listColors2.add("A test");
        listColors2.add("F test");
        
        System.out.println(listColors2);
        
        listColors1.addAll(listColors2);
        System.out.println(listColors1);
    }
}
