package s12_Generics.a249;

import java.util.List;

public class ListaUtil {
	
	public static Object getUltimo1(List<?> lista) {
		return lista.get(lista.size()-1);
	}
}
