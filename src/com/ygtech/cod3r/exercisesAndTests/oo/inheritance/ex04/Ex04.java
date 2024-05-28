package com.ygtech.cod3r.exercisesAndTests.oo.inheritance.ex04;

class Ex04 {

	public static void main(String[] args) {

		/*
		 * 4. Write a Java program to create a class called Employee with methods called work() and getSalary(). 
		 * Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee().*/
		
		HRManager hrManager = new HRManager();
		
		hrManager.setSalary(2000);
		
		System.out.println("HRM: $" + hrManager.getSalary());
		hrManager.work();
		hrManager.addEmployee();
	}
}
