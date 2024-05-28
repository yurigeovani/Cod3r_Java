package com.ygtech.cod3r.exercisesAndTests.oo.inheritance.ex10;

class Manager extends Employee{

	public Manager(String name, String address, double salary, String jobTitle) {
		super(name, address, salary, jobTitle);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateBonus() {
		return getSalary()*0.15;
	}

}
