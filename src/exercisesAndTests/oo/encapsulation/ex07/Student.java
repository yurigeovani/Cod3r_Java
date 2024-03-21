package exercisesAndTests.oo.encapsulation.ex07;

import java.util.ArrayList;
import java.util.List;

class Student {
	private int student_id;
	private String student_name;
	private List<Double> grades = new ArrayList<>();
	
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public List<Double> getGrades() {
		return grades;
	}

	public void addGrade(double grade) {
		if(grade<0 ||  grade>20) {
			System.out.println("Invalid grade!");
		} else if (grades.size()>3) {
			System.out.println("Limit of 4 grades reached.");
		} else {
			grades.add(grade);			
		}
	}
}
