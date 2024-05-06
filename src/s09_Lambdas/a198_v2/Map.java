package s09_Lambdas.a198_v2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

class Map {

	public static void main(String[] args) {

		Consumer<String> print = System.out::print;
		
		List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda\n");
		
		marcas.stream().map(m -> m.toUpperCase()).forEach(print);
		
		//UnaryOperator<String> maiuscula = n -> n.toUpperCase();
		UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
		//UnaryOperator<String> grito = n -> n.concat("!!! ");
		
		System.out.println("\nUsando composição!");
		marcas.stream()
			.map(Utilitarios.maiuscula)
			.map(primeiraLetra)
			.map(Utilitarios::grito)
			.forEach(print);
	}

}
