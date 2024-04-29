package s08_Lambdas.a187;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

class OperadorBinario {

	public static void main(String[] args) {

		BinaryOperator<Double> media = (n1, n2) -> (n1+n2)/2;
		System.out.println(media.apply(9.8, 5.7));
		
		BiFunction<Double, Double, String> resultado = (n1, n2) -> ((n1+n2)/2) >= 7 ? "Aprovado" : "Reprovado";
		
		/* Ou poderia ser assim:
		  	BiFunction<Double, Double, String> resultado = (n1, n2) -> {
		   			double result = (n1+n2)/2;
		   			return result >= 7 ? "Aprovado" : "Reprovado";
		   	};
		 */
		
		System.out.println(resultado.apply(9.8, 5.7));

		Function<Double, String> conceito = m -> m >= 7 ? "Aprovado" : "Reprovado";
		
		System.out.println(media.andThen(conceito).apply(9.8, 5.7));
		
		
	}
}
