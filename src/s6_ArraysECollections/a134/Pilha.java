package s6_ArraysECollections.a134;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {

		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("O Pequeno Principe"); // adiciona e, em caso de pilha cheia, retorna false 
		livros.push("Don Quixote"); // adiciona e, em caso de pilha cheia, retorna exception 
		livros.push("O Hobbit");
		livros.push("O Cravo E A Rosa");
		livros.push("João");
				
		System.out.println(livros.peek()); // retorna o primeiro elemento da pilha, não o remove e, em caso de pilha vazia, retorna null
		System.out.println(livros.element()); // também retorna o primeiro elemento da pilha, não o remove e, em caso de pilha vazia, retorna exception
		
		System.out.println(livros.poll()); // retorna e remove o primeiro elemento da pilha mas, em caso de vazia, retorna null
		System.out.println(livros.remove()); // também retorna e remove o primeiro elemento da pilha mas, em caso de vazia, retorna exception
		System.out.println(livros.pop());
		
		// tem também os mesmos métodos das outras collections, como size, clear, contains, isEmpty
		
		for (String string : livros) {
			System.out.println("eh " + string);
		}
	}

}
