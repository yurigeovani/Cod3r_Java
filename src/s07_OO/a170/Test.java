package s07_OO.a170;

class Test {

	public static void main(String[] args) {

		Mamifero a = new Cachorro();
		
		System.out.println(a.mover());
		System.out.println(a.mamar());
		System.out.println(a.respirar());
	}

}
