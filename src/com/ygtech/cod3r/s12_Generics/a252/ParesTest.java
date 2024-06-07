package com.ygtech.cod3r.s12_Generics.a252;

class ParesTest {

	public static void main(String[] args) {

		Pares<Integer, String> resultadoConcurso = new Pares<>();
		
		resultadoConcurso.adicionar(1, "Maria");
		resultadoConcurso.adicionar(2, "Pedro");
		resultadoConcurso.adicionar(3, "Bia");
		resultadoConcurso.adicionar(4, "Gui");
		resultadoConcurso.adicionar(2, "Rebeca");
		
		System.out.println(resultadoConcurso.getValor(1));
		System.out.println(resultadoConcurso.getValor(2));
		
	}

}
