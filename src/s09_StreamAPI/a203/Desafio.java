package s09_StreamAPI.a203;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

class Desafio {

	public static void main(String[] args) {

		Produto p1 = new Produto("Arroz", "Mercearia", 1.25, LocalDate.of(2025, 5, 13), false);
		Produto p2 = new Produto("Feijão", "Mercearia", 0.99, LocalDate.of(2023, 5, 13), true);
		Produto p3 = new Produto("Maçã", "Fruta", 2.49, LocalDate.of(2024, 5, 7), true);
		Produto p4 = new Produto("Kiboa", "Limpeza", 1.99, LocalDate.of(2022, 10, 23), true);
		Produto p5 = new Produto("Carne", "Talho", 8.79, LocalDate.of(2024, 6, 19), false);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		
		Predicate<Produto> promocao = p -> p.promocao;
		Function<Produto, String> produtoPreco = p -> p.descricao + "\tR$ " + p.preco + "\n"; 
		Predicate<Produto> valido = p -> p.validade.isEqual(LocalDate.now()) || p.validade.isAfter(LocalDate.now());

		// Implementar 
		//.filter(p -> p.categoria.equals("Mercearia"))
		
		produtos.stream()
			.filter(valido)
			.filter(promocao)
			.map(produtoPreco)
			.forEach(System.out::print);
		
	}
}
