package com.ygtech.cod3r.s12_Generics.a248;

class CaixaNumeroTeste {

	public static void main(String[] args) {

		CaixaNumero<Double> caixaA = new CaixaNumero<>();
		caixaA.guardar(5.7);
		System.out.println(caixaA.abrir());

		CaixaNumero<Integer> caixaB = new CaixaNumero<>();
		caixaB.guardar(5);
		System.out.println(caixaB.abrir());
	}

}
