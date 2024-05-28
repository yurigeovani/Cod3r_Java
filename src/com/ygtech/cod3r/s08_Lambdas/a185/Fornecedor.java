package com.ygtech.cod3r.s08_Lambdas.a185;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

class Fornecedor {

	public static void main(String[] args) {

		Supplier<List<String>> umLista = () -> Arrays.asList("Ana", "Bia", "Lia", "Gui");
		
		System.out.println(umLista.get());
	}
}
