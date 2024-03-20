package exercisesAndTests.oo.encapsulation.ex06;

class Ex06 {

	public static void main(String[] args) {

		/*
		 * 6. Write a Java program to create a class called Car with private instance variables company_name, model_name, year, and mileage. 
		 * Provide public getter and setter methods to access and modify the company_name, model_name, and year variables.
		 * However, only provide a getter method for the mileage variable.
		 * */
		
	    Car car = new Car();

	    car.setCompany_name("Chevrolet");
	    car.setModel_name("Cruze");
	    car.setYear(2009);

	    String company_name = car.getCompany_name();
	    String model_name = car.getModel_name();
	    int year = car.getYear();
	    double mileage = car.getMileage();

	    System.out.println("Company Name: " + company_name);
	    System.out.println("Model Name: " + model_name);
	    System.out.println("Year: " + year);
	    System.out.println("Mileage: " + mileage);
	}
}
