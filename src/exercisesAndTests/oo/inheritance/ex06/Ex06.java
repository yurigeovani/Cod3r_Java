package exercisesAndTests.oo.inheritance.ex06;

class Ex06 {

	public static void main(String[] args) {

		/*6. Write a Java program to create a class called Animal with a method named move().
		 * Create a subclass called Cheetah that overrides the move() method to run.
		 */
		
		Animal animal = new Animal();
		Cheetah cheetah = new Cheetah();
		
		animal.move();
		cheetah.move();
	}

}
