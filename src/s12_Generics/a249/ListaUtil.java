package s12_Generics.a249;

import java.util.List;

public class ListaUtil {
	
	public static Object getUltimo1(List<?> lista) {
		return lista.get(lista.size()-1);
	}

	public static <T> T getUltimo2(List<T> lista) {
		return lista.get(lista.size()-1);
	}

	// Exemplo de mais de um parametro generico:
	/*public static <A, B, C> C teste(A paramA, B paramB) {
		C teste = null;
		return teste;
	}*/
}
