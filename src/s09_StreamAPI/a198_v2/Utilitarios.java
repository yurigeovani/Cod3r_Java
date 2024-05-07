package s09_StreamAPI.a198_v2;

import java.util.function.UnaryOperator;

class Utilitarios {
	
	private Utilitarios() {
	}

	public final static 	UnaryOperator<String> maiuscula = n -> n.toUpperCase();

	public final static 	UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
	
	public final static 	String grito (String n) {
		return n.concat("!!! ");
	}
}
