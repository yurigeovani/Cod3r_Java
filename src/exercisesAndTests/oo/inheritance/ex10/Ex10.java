package exercisesAndTests.oo.inheritance.ex10;

class Ex10 {

	public static void main(String[] args) {
		
		/*
		 * 10. Write a Java program that creates a class hierarchy for employees of a company. 
		 * The base class should be Employee, with subclasses Manager, Developer, and Programmer. 
		 * Each subclass should have properties such as name, address, salary, and job title.
		 * Implement methods for calculating bonuses, generating performance reports, and managing projects.
		 * */
		
        Manager manager = new Manager("Avril Aroldo", "1 ABC St", 80000.0, "Manager");
        Developer developer = new Developer("Iver Dipali", "2 PQR St", 72000.0, "Developer");
        Programmer programmer = new Programmer("Yaron Gabriel", "3 ABC St", 76000.0, "Python");

        System.out.println("Manager's Bonus: $" + manager.calculateBonus());
        System.out.println("Developer's Bonus: $" + developer.calculateBonus());
        System.out.println("Programmer's Bonus: $" + programmer.calculateBonus());
	}
}
