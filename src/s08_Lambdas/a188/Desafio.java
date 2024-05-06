package s08_Lambdas.a188;

import java.util.Locale;
import java.util.function.Function;
import java.util.function.UnaryOperator;

class Desafio {

	public static void main(String[] args) {

		/*
		 * 1. A partir do produto, calcular o preço real (com desconto) 2. Imposto
		 * municipal: >= 2500 (8.5%) < 2500 (Isento) 3. Frete: >3000 (100) <3000 (50) 4.
		 * Arredondar: Deixar duas casas decimais 5. Formatar: Ex.: R$ 1234,56
		 */

		// Calcular desconto

//		Function<Produto, Double> precoFinal = p -> p.preco * (1 - p.desconto);
//		UnaryOperator<Double> impostoMunicipal = p -> p>=2500 ? p * 1.085 : p ;
//		UnaryOperator<Double> frete = p -> p>=3000 ? p +100 : p +50;
//		UnaryOperator<Double> arredondar = p -> Double.parseDouble(String.format("%.2f", p));
//		Function<Double, String> formatar = p -> ("R$ " + p).replace(".", ".");

		Function<Produto, Double> precoFinal = produto -> produto.preco * (1 - produto.desconto);
		UnaryOperator<Double> impostoMunicipal = preco -> preco >= 2500 ? preco * 1.085 : preco;
		UnaryOperator<Double> frete = preco -> preco >= 3000 ? preco + 100 : preco + 50;
		UnaryOperator<Double> arredondar = preco -> Double.parseDouble(String.format(Locale.US, "%.2f", preco));
		Function<Double, String> formatar = preco -> ("R$ " + preco).replace(".", ",");

		Produto p = new Produto("iPad", 3235.89, 0.13);

		String preco = precoFinal
				.andThen(impostoMunicipal)
				.andThen(frete)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(p);

		System.out.println("O preço final é " + preco);
	}
}
