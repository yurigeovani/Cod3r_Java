package com.ygtech.cod3r.s06_ArraysECollections.a130;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

class ConjuntoComportado {

	public static void main(String[] args) {

		// Set<String> listaAprovados = new HashSet<>(); // Não ordenado
		// Set<String> listaAprovados = new TreeSet<>(); // Ordenado alfabeticamente
		SortedSet<String> listaAprovados = new TreeSet<>(); // Ordenado alfabeticamente
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Ana");
		listaAprovados.add("Pedro");
		
		for (String candidato : listaAprovados) {
			System.out.println(candidato);
		}

		
		Set<Integer> nums = new HashSet<>(); // não aceita int, aceita Integer
		nums.add(1);
		nums.add(2);
		nums.add(4);
		nums.add(3);

		// nums.get(1) não é possível acessar pelo índice
		for (int num: nums) {
			System.out.println(num);
		}
	}

}
