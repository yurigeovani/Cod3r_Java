package s07_OO.a144;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	final String nome;
	final List<Compra> compras = new ArrayList<>();
	
	public Cliente(String nome) {
		super();
		this.nome = nome;
	}
	
	void adicionarCompra(Compra compra) {
		this.compras.add(compra);
	}

	double getValotTotal() {
		double total = 0;
		
		for (Compra compra : compras) {
			total += compra.getValorTotal();
		}
		
		return total;
	}
		
}
