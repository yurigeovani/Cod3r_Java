package s6_ArraysECollections.a135;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {

		Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1, "Roberto");
		usuarios.put(20, "Ricardo");
		usuarios.put(3, "Rafaela");
		usuarios.put(4, "Rebeca");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		
		System.out.println(usuarios.keySet()); // retorna todas as chaves
		System.out.println(usuarios.values()); // retorna os valores
		System.out.println(usuarios.entrySet()); // retorna chave e valor
		
		System.out.println(usuarios.containsKey(20)); // retorna true ou false caso encontre ou não a chave
		System.out.println(usuarios.containsValue("Rebeca")); // retorna true ou false caso encontre ou não o valor
		
		System.out.println(usuarios.get(4)); // retorna o valor da chave informada
		System.out.println(usuarios.remove(4)); // remove a partir da chave
		System.out.println(usuarios.remove(3, "Rafael")); // remove somente se a chave e valor informado estiverem corretos
		
		for (int chave : usuarios.keySet()) {
			System.out.println(chave);
		}
		
		for (String valor : usuarios.values()) {
			System.out.println(valor);
		}
		
		for(Entry<Integer, String> registro : usuarios.entrySet()) {
			System.out.print(registro.getKey() + " => ");
			System.out.println(registro.getValue());
		}
	}

}
