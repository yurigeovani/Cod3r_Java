package exercisesAndTests.oo.inheritance.ex10;

abstract class Employee {
	
	private String name;
	private String address;
	private double salary;
	private String jobTitle;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public abstract double calculateBonus();
	
	public Employee(String name, String address, double salary, String jobTitle) {
		super();
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.jobTitle = jobTitle;
	}
}
