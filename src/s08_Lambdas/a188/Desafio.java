package s08_Lambdas.a188;

import java.util.function.Function;

class Desafio {

	public static void main(String[] args) {

		/*
		 		1. A partir do produto, calcular o preço real (com desconto)
		 		2. Imposto municipal: 
		 			>= 2500 (8.5%)
					< 2500 (Isento)
				3. Frete:
					>3000 (100)
					<3000 (50)
				4. Arredondar:
					Deixar duas casas decimais
				5. Formatar:
					Ex.: R$ 1234,56
		 */
		
		Produto p = new Produto("iPad", 3235.89, 0.13);
		
		//Calcular desconto
		Function<Produto, Double> precoFinal;
		
	}
}
