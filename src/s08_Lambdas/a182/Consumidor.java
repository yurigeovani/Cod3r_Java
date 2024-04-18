package s08_Lambdas.a182;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class Consumidor {

	public static void main(String[] args) {
		
		Consumer<Produto> imprimirNome = p -> System.out.println("Produto: " + p.getNome());

		Produto p1 = new Produto("Caderno", 19.90);
		Produto p2 = new Produto("Livro", 49.90);
		Produto p3 = new Produto("Notebook", 1999.90);
		Produto p4 = new Produto("Lápis", 1.90);
		Produto p5 = new Produto("Borracha", 0.90);

		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4 ,p5);
		
		imprimirNome.accept(p1);
		imprimirNome.accept(p2);
		
		System.out.println("\n###Foreach example:");
		produtos.forEach(imprimirNome);
		
		System.out.println("\n###Manual foreach example:");
		produtos.forEach(p -> System.out.println(p.getValor()));
		
		System.out.println("\n###Using foreach example:");
		//Caso não seja implementado o ToString no classe, é impresso o endereço de memória:
		//Exemplo antes de implementar o ToString:
					//		s08_Lambdas.a182.Produto@7adf9f5f
					//		s08_Lambdas.a182.Produto@85ede7b
					//		s08_Lambdas.a182.Produto@5674cd4d
					//		s08_Lambdas.a182.Produto@63961c42
					//		s08_Lambdas.a182.Produto@65b54208
		produtos.forEach(System.out::println);
	}

}
