package com.ygtech.cod3r.s12_Generics.a247;

class CaixaIntTeste {

	public static void main(String[] args) {

		CaixaInt caixaA = new CaixaInt();
		caixaA.guardar(123);
		
		Integer coisaA = caixaA.abrir();
		System.out.println(coisaA);
	}

}
