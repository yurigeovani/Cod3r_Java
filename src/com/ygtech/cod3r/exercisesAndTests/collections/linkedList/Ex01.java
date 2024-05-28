package com.ygtech.cod3r.exercisesAndTests.collections.linkedList;

import java.util.LinkedList;

class Ex01 {
    public static void main(String[] args) {

        /* 1. Write a Java program to append the specified element to the end of a linked list. */

        LinkedList<String> listColors = new LinkedList<>();

        listColors.add("Red");
        listColors.add("Green");
        listColors.add("Blue");
        listColors.add("Black");
        listColors.add("White");

        System.out.println(listColors);
    }
}
