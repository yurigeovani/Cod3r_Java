package com.ygtech.cod3r.s05_ClassesEMetodos.a115;

class Pessoa {

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
		System.out.printf("Olah, eu sou %s e tenho %.3f Kg.\n", nome, peso);
	}

}
