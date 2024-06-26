package com.ygtech.cod3r.s07_OO.a142;

import java.util.ArrayList;

class Compra {

	String cliente;
	ArrayList<Item> itens = new ArrayList<>();
	

	void addItem (String nome, int quantidade, double preco) {
		this.addItem((new Item(nome, quantidade, preco)));
	}
	
	void addItem (Item item) {
		this.itens.add(item);
		item.compra = this;
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for (Item item : itens) {
			total += item.quantidade * item.preco;
		}
		
		return total;
	}

}
