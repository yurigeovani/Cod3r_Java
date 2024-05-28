package com.ygtech.cod3r.exercisesAndTests.oo.encapsulation.ex01;

class Ex01 {

	public static void main(String[] args) {

		/*1. Write a Java program to create a class called Person with private instance variables name, age. and country. 
		 * Provide public getter and setter methods to access and modify these variables.*/
		
		Person person1 = new Person();
		
		person1.setName("Yuri");
		person1.setAge(33);
		person1.setCountry("BR");
		
		System.out.println(person1.getName() + person1.getAge() + person1.getCountry());

		Person person2 = new Person();
		
		person2.setName("Luma");
		person2.setAge(10);
		person2.setCountry("BR");
		
		System.out.println(person2.getName() + person2.getAge() + person2.getCountry());
		
	}
}
