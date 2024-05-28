package com.ygtech.cod3r.exercisesAndTests.oo.polymorphism.ex04;

class Manager extends Employee{

	public Manager(String name, double salary) {
		super(name, "Manager", salary);
	}

	@Override
	public double calculateSalary() {
		return getSalary()*1.5;
	}
	
}
