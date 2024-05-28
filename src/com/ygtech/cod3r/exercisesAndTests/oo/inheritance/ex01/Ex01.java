package com.ygtech.cod3r.exercisesAndTests.oo.inheritance.ex01;

class Ex01 {

	public static void main(String[] args) {

		/*
		 * 1. Write a Java program to create a class called Animal with a method called makeSound(). 
		 * Create a subclass called Cat that overrides the makeSound() method to bark.
		 */
		Animal animal = new Animal();
		Cat cat = new Cat();
		
		animal.makeSound();
		cat.makeSound();
	}

}
