package s5_ClassesEMetodos.a115;

public class Pessoa {

	String nome;
	double peso;

	Pessoa() {
	}

	Pessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}

	void Comer(Comida c) {
		if(c!=null) {
			this.peso += c.peso;
		}
	}
	
	void apresentar() {
		System.out.printf("Olah, eu sou o %s e tenho %.3fKg.\n", nome, peso);
	}

}
