package s07_OO.a144;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	
	final List<ItemCompra> itens = new ArrayList<>();
	
	void adicionarItem (Produto p, int qtd) {
		this.itens.add(new ItemCompra(p, qtd));
	}
	
	void adicionarItem (String nome, double preco, int qtd) {
		var produto = new Produto(nome, preco);
		this.itens.add(new ItemCompra( produto, qtd));
	}
	
	double getValorTotal() {
		double total = 0;
		
		for(ItemCompra item : itens) {
			total += item.quantidade * item.produto.preco;
		}
		
		return total;
	}
}
