package com.ygtech.cod3r.s12_Generics.a252;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

class Pares <C extends Number, V> {

	private final Set<Par<C, V>> itens = new LinkedHashSet<>();
	
	public void adicionar (C chave, V valor) {
		
		// ao usar um return em um metodo void, ele simplesmente encerra o metodo sem retornar nada
		if(chave == null) return;
		
		Par<C, V> novoPar = new Par<C, V>(chave, valor);
		
		// Verifica se a chave já existe e a remove, em caso do valor ser diferente e atualizar para o novo valor
		if(itens.contains(novoPar)) {
			itens.remove(novoPar);
		}
		
		// Assim, garante que para a chamada abaixo, não exista chave null
		itens.add(novoPar);
	}
	
	public V getValor (C chave) {
		if(chave == null) return null;
		Optional<Par<C, V>> parOpcional = itens.stream()
				.filter(par -> chave.equals(par.getChave()))
				.findFirst();
		return parOpcional.isPresent() 
					? parOpcional.get().getValor() : null;
	}
}
