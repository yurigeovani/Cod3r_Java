package exercisesAndTests.interfaces.ex03;

class Ex03 {

	public static void main(String[] args) {
		
		/*
		 * 3. Write a Java program to create an interface Flyable with a method called fly_obj().
		 * Create three classes Spacecraft, Airplane, and Helicopter that implement the Flyable interface. Implement the fly_obj() method for each of the three classes.*/
		
		
        Spacecraft spacecraft = new Spacecraft();
        spacecraft.flyObj();
        
        Airplane airplane = new Airplane();
        airplane.flyObj();
        
        Helicopter helicopter = new Helicopter();
        helicopter.flyObj();
        

        Flyable[] flyingObjects = {new Spacecraft(), new Airplane(), new Helicopter()};
        for (Flyable flyable : flyingObjects) {
			flyable.flyObj();
		}
	}
}
