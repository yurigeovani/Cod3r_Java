package s09_StreamAPI.a194;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

class ImprimindoObjetos {

	public static void main(String[] args) {

		List<String> aprovados = Arrays.asList("Bia", "Lu", "Gui", "Ana");

		System.out.println("Usando FOREACH:");
		for (String nome : aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\nUsando ITERATOR:");
		Iterator<String> i = aprovados.iterator();
		
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("\nUsando STREAM:");
		Stream<String> st = aprovados.stream(); 
		st.forEach(System.out::println); // Laço interno
	}
}
