package com.ygtech.cod3r.exercisesAndTests.oo.polymorphism.ex04;

abstract class Employee {
	
	private String name;
	private String role;	
	private double salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	

	public Employee(String name, String role, double salary) {
		super();
		this.name = name;
		this.role = role;
		this.salary = salary;
	}

	public double calculateSalary() {
		return getSalary();
	}
	
}
