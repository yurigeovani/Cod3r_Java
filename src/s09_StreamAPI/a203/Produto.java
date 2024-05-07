package s09_StreamAPI.a203;

import java.time.LocalDate;

class Produto {

	final String descricao;
	final String categoria;
	final double preco;
	final LocalDate validade;
	final boolean promocao;

	public Produto(String descricao, String categoria, double preco, LocalDate validade, boolean promocao) {
		super();
		this.descricao = descricao;
		this.categoria = categoria;
		this.preco = preco;
		this.validade = validade;
		this.promocao = promocao;
	}
}
