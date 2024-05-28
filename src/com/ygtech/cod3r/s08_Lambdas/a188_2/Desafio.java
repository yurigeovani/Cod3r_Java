package com.ygtech.cod3r.s08_Lambdas.a188_2;

import java.util.Locale;
import java.util.function.Function;
import java.util.function.UnaryOperator;

class Desafio {

	public static void main(String[] args) {

		/*
 			1. A partir do produto, calcular o preço real (com desconto)
 			2. Imposto municipal: >= 2500 (8,5%)  | < 2500 (isento)
 			3. Frete: >= 3000 (100) | < 3000 (50)
 			4. Arredondar: deixar duas casas decimais
 			5. Formatar: R$ 1234,56
		 */
		
		Produto produto = new Produto ("iPad", 3235.89, 13);
		
		Function<Produto, Double> calcularDesconto = prod -> prod.preco - ((prod.preco * prod.desconto) / 100);
		UnaryOperator<Double> calcularImposto = preco -> preco >= 2500 ? preco + (preco*0.085) : preco; 
		UnaryOperator<Double> calcularFrete = preco -> preco >= 3000 ? preco+100 : preco+50;

		// Duas formas para resolver o problema das configurações locais de idioma, moedas, etc:
		//		UnaryOperator<Double> arredondarPreco = preco -> Double.parseDouble(String.format("%.2f", preco).replace(",", "."));
		UnaryOperator<Double> arredondarPreco = preco -> Double.parseDouble(String.format(Locale.US, "%.2f", preco));
		Function<Double, String> formatarPreco = preco -> "R$ " + preco.toString().replace(".", ",");
		
		String precoFinal = 
				calcularDesconto
				.andThen(calcularImposto)
				.andThen(calcularFrete)
				.andThen(arredondarPreco)
				.andThen(formatarPreco)
				.apply(produto);
		
		System.out.println(precoFinal);		
	}
}
