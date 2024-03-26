package exercisesAndTests.interfaces.ex05;

class Ex05 {

	public static void main(String[] args) {

		/*
		 * 5. Write a Java program to create an interface Resizable with methods resizeWidth(int width) and resizeHeight(int height) that allow an object to be resized.
		 * Create a class Rectangle that implements the Resizable interface and implements the resize methods.
		 * */
		
		Rectangle rectangle = new Rectangle(10, 15);
		
		rectangle.resizeHeight(2);
		rectangle.resizeWidth(22);
		
		System.out.println(rectangle.toString());
	}
}
