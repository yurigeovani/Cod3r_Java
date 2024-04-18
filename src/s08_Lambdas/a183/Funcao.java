package s08_Lambdas.a183;

import java.util.function.Function;

class Funcao {

	public static void main(String[] args) {

		Function<Integer, String> parOuImpar = 
				numero -> numero%2 == 0 ? "Par" : "Impar";
				
		System.out.println(parOuImpar.apply(10));
		System.out.println(parOuImpar.apply(33));
		
		Function<String, String> resultado = valor -> "O resultado é: " + valor;
		
		Function<String, String> empolgado = valor ->valor + "!!!"; 
		Function<String, String> duvida = valor ->valor + "???"; 
		
		String resultadoFinal1 = 
				parOuImpar
				.andThen(resultado)
				.apply(10);

		System.out.println(resultadoFinal1);

		String resultadoFinal2 = 
				parOuImpar
				.andThen(resultado)
				.andThen(empolgado)
				.apply(10);
		
		System.out.println(resultadoFinal2);
		
		String resultadoFinal3 = 
				parOuImpar
				.andThen(resultado)
				.andThen(duvida)
				.apply(11);
		
		System.out.println(resultadoFinal3);
		
		
	}

}
