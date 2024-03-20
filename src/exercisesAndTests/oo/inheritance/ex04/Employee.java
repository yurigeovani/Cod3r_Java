package exercisesAndTests.oo.inheritance.ex04;

abstract class Employee {

	private double salary;
	public void work() {
		System.out.println("Employee working!");
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
