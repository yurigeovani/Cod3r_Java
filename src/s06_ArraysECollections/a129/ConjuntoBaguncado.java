package s06_ArraysECollections.a129;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
		
		System.out.println("Tamanho é " + conjunto.size());
		
		conjunto.add("teste");
		
		System.out.println("Tamanho é " + conjunto.size());
		
		conjunto.add('x');
		
		System.out.println("Tamanho é " + conjunto.size());
		
		System.out.println(conjunto.remove("teste"));
		
		System.out.println(conjunto.remove("Teste"));
		
		System.out.println("Tamanho é " + conjunto.size());

		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains(true));
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		// União de dois Conjuntos
		// Adiciona todos de nums para conjunto
		conjunto.addAll(nums);

		// Intersecção de dois Conjuntos
		// Mantém apenas o mesmo valor que contém nos dois grupos.
		//conjunto.retainAll(nums);
		
		// Diferença entre dois conjuntos
		// Mantém apenas o que não contém igual entre os grupos
		conjunto.removeAll(nums);
		// Limpar o conjunto
		//conjunto.clear();
		System.out.println(nums);
		System.out.println(conjunto);
		
		
	}

}
