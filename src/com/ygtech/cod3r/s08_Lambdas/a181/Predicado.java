package com.ygtech.cod3r.s08_Lambdas.a181;

import java.util.function.Predicate;

class Predicado {

	public static void main(String[] args) {

		Predicate<Produto> isCaro = prod -> (prod.preco * (1 - prod.desconto)) >= 750;
		
		Produto produto = new Produto("notebook", 3893.99, 0.85);
		System.out.println(isCaro.test(produto));
	}

}
