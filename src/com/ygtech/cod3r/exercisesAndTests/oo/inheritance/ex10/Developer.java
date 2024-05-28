package com.ygtech.cod3r.exercisesAndTests.oo.inheritance.ex10;

class Developer extends Employee{

	public Developer(String name, String address, double salary, String jobTitle) {
		super(name, address, salary, jobTitle);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateBonus() {
		return getSalary()*0.1;
	}

}
