package exercisesAndTests.oo.inheritance.ex07;

class Ex07 {

	public static void main(String[] args) {

		/**
		 * 7. Write a Java program to create a class known as Person with methods called getFirstName() and getLastName().
		 * Create a subclass called Employee that adds a new method named getEmployeeId() and overrides the getLastName() method to include the employee's job title.
		 * */
		
	      Employee employee1 = new Employee("Kortney", "Rosalee", 4451, "HR Manager");
	      System.out.println(employee1.getFirstName() + " " + employee1.getLastName() + " (" + employee1.getEmployeeId() + ")");
		  Employee employee2 = new Employee("Junior", "Philipa", 4452, "Software Manager");
	      System.out.println(employee2.getFirstName() + " " + employee2.getLastName() + " (" + employee2.getEmployeeId() + ")");

	}
}
