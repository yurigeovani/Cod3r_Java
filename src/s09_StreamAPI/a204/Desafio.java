package s09_StreamAPI.a204;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

class Desafio {

	public static void main(String[] args) {

		Produto p1 = new Produto("Roupeiro", 99.90, 30, 100);
		Produto p2 = new Produto("Geladeira", 299.90, 25, 80);
		Produto p3 = new Produto("PC", 2199.90, 35, 0);
		Produto p4 = new Produto("Fogão", 199.90, 50, 50);
		Produto p5 = new Produto("Microondas", 69.90, 0, 0);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);

		Function<Produto, String> produtoPreco = p -> p.nome + "\tR$ " + p.preco + " Super PROMOÇÃO!\n";
		Predicate<Produto> promoBoa = p -> p.desconto>30; 
		Predicate<Produto> freteGratis = p -> p.frete == 0;
		
		produtos.stream()
			.filter(promoBoa)
			.filter(freteGratis)
			.map(produtoPreco)
			.forEach(System.out::print);
	}
}
