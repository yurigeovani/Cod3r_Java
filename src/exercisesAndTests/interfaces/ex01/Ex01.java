package exercisesAndTests.interfaces.ex01;

public class Ex01 {

	public static void main(String[] args) {

		/*
		 * 1. Write a Java program to create an interface Shape with the getArea() method.
		 * Create three classes Rectangle, Circle, and Triangle that implement the Shape interface. Implement the getArea() method for each of the three classes.
		 * */
		
        Rectangle rectangle = new Rectangle(10, 12);
        
        // Create a Circle object with radius=3
        Circle circle = new Circle(3);
        
        // Create a Triangle object with base=4 and height=6
        Triangle triangle = new Triangle(4, 6);

        // Print the area of the Rectangle
        System.out.println("Area of the Rectangle: " + rectangle.getArea());
        
        // Print the area of the Circle
        System.out.println("Area of the Circle: " + circle.getArea());
        
        // Print the area of the Triangle
        System.out.println("Area of the Triangle: " + triangle.getArea());

		
	}

}
