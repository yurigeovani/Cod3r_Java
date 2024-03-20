package exercisesAndTests.oo.encapsulation.ex04;

class Ex04 {

	public static void main(String[] args) {

		/*
		 * 4. Write a Java program to create a class called Employee with private instance variables employee_id, employee_name, and employee_salary. 
		 * Provide public getter and setter methods to access and modify the id and name variables, but provide a getter method for the salary 
		 * variable that returns a formatted string.*/
		
		Employee employee1 = new Employee();
		employee1.setEmployee_id(123);
		employee1.setEmployee_name("Yuri");
		employee1.setEmployee_salary(1000.01);
		
		System.out.println(employee1.getEmployee_id() + " - " + employee1.getEmployee_name());
		System.out.println(employee1.getEmployee_salary());
		System.out.println(employee1.getEmployee_salary_formatted());
		
	}
}
