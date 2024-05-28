package com.ygtech.cod3r.exercisesAndTests.loiane.linkedList;

class ListaEncadeadaTeste {

	public static void main(String[] args) {

		ListaEncadeada<Integer> lista = new ListaEncadeada<>();

//		System.out.println("Tamanho: " + lista.getTamanho());
		System.out.println(lista);

		lista.adiciona(20);
		//System.out.println("Tamanho: " + lista.getTamanho());
		System.out.println(lista);

		lista.adiciona(53);
		//System.out.println("Tamanho: " + lista.getTamanho());
		System.out.println(lista);
		
		lista.adiciona(11);
		//System.out.println("Tamanho: " + lista.getTamanho());
		System.out.println(lista);

		lista.limpa();
		System.out.println(lista);
	}
 
}
