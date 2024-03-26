package s07_OO.a170;

abstract class Mamifero extends Animal {
	
	@Override
	public String mover() {
		return "Usando as patas!";
	}
	
	abstract String mamar (); 

}
