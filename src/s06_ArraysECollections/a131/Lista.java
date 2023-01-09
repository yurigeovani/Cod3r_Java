package s06_ArraysECollections.a131;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {

		//ArrayList<Usuario> lista = new ArrayList<>();
		List<Usuario> lista = new ArrayList<>(); // Pode ser chamado tanto por ArrayList quanto por List
		
		Usuario u1 = new Usuario("Ana");
		
		lista.add(u1); // Pode adicionar usando um objeto
		
		lista.add(new Usuario("Carlos")); // Pode adicionar o valor do objeto diretamente
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		lista.add(new Usuario("Manu"));
		
		System.out.println("Acessar a partir do íncide: " + lista.get(3).nome); // utilizar a partir do índice
		
		System.out.println("Remove com indice: " + lista.remove(1)); // pode ser removido usando índice
		System.out.println("Remove com objeto: " + lista.remove(new Usuario("Manu"))); // pode ser removido usando o objeto
		System.out.println("Remove com objeto: " + lista.remove(new Usuario("Manu"))); // pode ser removido usando o objeto
		
		System.out.println("Tem? " + lista.contains(new Usuario("Manu")));
		for (Usuario usuario : lista) {
			System.out.println(usuario.nome);
		}
	}

}
