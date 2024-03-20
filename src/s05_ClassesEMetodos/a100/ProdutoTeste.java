package s05_ClassesEMetodos.a100;

class ProdutoTeste {

	public static void main(String[] args) {

		Produto p1 = new Produto("Notebook", 4356.89, 0.25);
		
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		p2.desconto = 0.29;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinalGerente1 = p1.precoComDesconto(0.1);
		
		System.out.printf("Preço final: R$ %.2f.\n", precoFinal1);
		System.out.printf("Preço final Gera: R$ %.2f.\n", precoFinalGerente1);

		double precoFinal2 = p2.precoComDesconto();
		double precoFinalGerente2 = p2.precoComDesconto(0.1);
		
		System.out.printf("Preço final: R$ %.2f.\n", precoFinal2);
		System.out.printf("Preço final Gera: R$ %.2f.", precoFinalGerente2);

	}

}
