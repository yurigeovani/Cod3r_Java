package s5_ClassesEMetodos.a115;

public class Jantar {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("Yuri", 92.1);
		Pessoa p2 = new Pessoa("Thaty", 62.0);
		Comida c1 = new Comida("Buchada",0.3);
		Comida c2 = new Comida("Sarrabulho",0.5);
		
		p1.apresentar();
		p2.apresentar();
		
		p1.Comer(c1);
		p1.Comer(c2);

		p1.apresentar();
		p2.apresentar();
		
		p2.Comer(c2);
		p2.Comer(c2);

		p1.apresentar();
		p2.apresentar();
	
	}
}
