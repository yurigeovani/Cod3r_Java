package com.ygtech.cod3r.exercisesAndTests.oo.polymorphism.ex01;

class Ex01 {

	public static void main(String[] args) {
		
		/**1. Write a Java program to create a base class Animal (Animal Family) with a method called Sound().
		 * Create two subclasses Bird and Cat. Override the Sound() method in each subclass to make a specific sound for each animal.
		 */

		Animal animal = new Animal();
		animal.makeSound();
		
		Cat cat = new Cat();
		cat.makeSound();
		
		Bird bird = new Bird();
		bird.makeSound();
	}

}
