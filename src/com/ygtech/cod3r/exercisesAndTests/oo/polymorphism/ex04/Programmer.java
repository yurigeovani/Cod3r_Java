package com.ygtech.cod3r.exercisesAndTests.oo.polymorphism.ex04;

class Programmer extends Employee{

	public Programmer (String name, double salary) {
		super(name, "Programmer", salary);
	}

	@Override
	public double calculateSalary() {
		return getSalary()*1.2;
	}

}
