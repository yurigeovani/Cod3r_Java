package s05_ClassesEMetodos.a105;

class Produto {
	String nome;
	double preco;
	static double desconto = 0.15;

	Produto() {
	}

	Produto(String nomeInicial, double precoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
	}

	double precoComDesconto() {
		return preco * (1 - desconto);
	}

	double precoComDesconto(double descontoGerente) {
		return preco * (1 - desconto - descontoGerente);
	}

}
