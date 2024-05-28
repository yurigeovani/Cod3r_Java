package com.ygtech.cod3r.s03_Fundamentos;

class Inferencia {

	public static void main(String[] args) {
		double a = 4.5; // declaracao e inicializacao
		System.out.println(a);
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		c = "Recebe outro texto";
		System.out.println(c);
		
		// c = 4.5;
		// Não funcionará por motivos de Inferencia:
		// O Java atribui o primeiro tipo da primeira atribuição 
		// e mantem ate o fim ao utilizar o tipo "var"
		// System.out.println(c);
		
		double d; // variavel foi declarada
		d = 123.65; // variável foi inicializada
		System.out.println(d); // variavel foi utilizada
	}
}