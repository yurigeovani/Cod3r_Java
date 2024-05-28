package com.ygtech.cod3r.exercisesAndTests.oo.encapsulation.ex07;

class Ex07 {

	public static void main(String[] args) {

		/*
		 * 7. Write a Java program to create a class called Student with private instance variables student_id, student_name, and grades. 
		 * Provide public getter and setter methods to access and modify the student_id and student_name variables. 
		 * However, provide a method called addGrade() that allows adding a grade to the grades variable while performing additional validation.
		 * */
		
		Student s1 = new Student();
		s1.addGrade(9.2);
		System.out.println(s1.getGrades());
		s1.addGrade(10.2);
		System.out.println(s1.getGrades());
		s1.addGrade(11.2);
		System.out.println(s1.getGrades());
		s1.addGrade(22.2);
		System.out.println(s1.getGrades());
		s1.addGrade(13.2);
		System.out.println(s1.getGrades());
		s1.addGrade(-22.2);
		System.out.println(s1.getGrades());
		s1.addGrade(22.2);
		System.out.println(s1.getGrades());
	}
}
