package com.ygtech.cod3r.exercisesAndTests.oo.encapsulation.ex03;

class Ex03 {

	public static void main(String[] args) {

		/*3. Write a Java program to create a class called Rectangle with private instance variables length and width. 
		 * Provide public getter and setter methods to access and modify these variables.
		 * */
		
		Rectangle rectangle1 = new  Rectangle();
		rectangle1.setLength(12.5);
		rectangle1.setWidth(32.4);
		
		System.out.println("Area rectangle 1: " + rectangle1.getLength()*rectangle1.getWidth());
				
		Rectangle rectangle2 = new  Rectangle();
		rectangle2.setLength(2.56);
		rectangle2.setWidth(5.44);
		
		System.out.println("Area rectangle 2: " + rectangle2.getLength()*rectangle2.getWidth());
		
		
	}
}
