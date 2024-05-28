package com.ygtech.cod3r.s06_ArraysECollections.a133;

import java.util.LinkedList;
import java.util.Queue;

class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();
		
		fila.add("Ana"); // adiciona na fila e, caso a fila esteja cheia, retorna exception.
		fila.offer("Bia"); // tambem adiciona na fila mas, caso a fila esteja cheia, retorna falso.
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafaela");
		fila.offer("Gui");
		
		System.out.println(fila.peek()); // retorna o primeiro elemento da fila, não o remove e, em caso de fila vazia, retorna null
		System.out.println(fila.element()); // também retorna o primeiro elemento da fila, não o remove e, em caso de fila vazia, retorna exception
				
		System.out.println(fila.poll()); // retorna e remove o primeiro elemento da fila mas, em caso de vazia, retorna null
		System.out.println(fila.poll());
		System.out.println(fila.remove()); // retorna e remove o primeiro elemento da fila mas, em caso de vazia, retorna exception
		
		// fila.size(); retorna o tamanho da fila
		// fila.clear(); limpa a fila
		// fila.isEmpty(); verifica se está vazia
		// fila.contains();
	}

}
