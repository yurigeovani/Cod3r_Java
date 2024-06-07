package com.ygtech.cod3r.s12_Generics.a251;

import java.util.List;

class ListaUtil {
	
	public static Object getUltimo1(List<?> lista) {
		return lista.get(lista.size()-1);
	}

	public static <T> T getUltimo2(List<T> lista) {
		return lista.get(lista.size()-1);
	}
}
