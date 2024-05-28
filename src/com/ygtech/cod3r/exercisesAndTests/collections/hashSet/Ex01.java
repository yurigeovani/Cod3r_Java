package com.ygtech.cod3r.exercisesAndTests.collections.hashSet;

import java.util.HashSet;

class Ex01 {
    public static void main(String[] args) {
        
        /* 1. Write a Java program to append the specified element to the end of a hash set. */

        HashSet<String> listColors = new HashSet<>();

        listColors.add("Red");
        listColors.add("Green");
        listColors.add("Blue");
        listColors.add("Black");
        listColors.add("White");

        System.out.println(listColors);
    }
}
