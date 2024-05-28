package com.ygtech.cod3r.s09_StreamAPI.a199;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

class DesafioMap {

	public static void main(String[] args) {

		/*
		 	1. Numero para string binária... 6 => "110"
		 	2. Inverter a string... "110" => "011"
		 	3. Converter de volta para inteiro => "011" => 3
		 */

		Consumer<Object> print = System.out::println;
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		Function<Integer, String>converterStringBinaria = num -> Integer.toBinaryString(num);
		UnaryOperator<String>inverterStringBinaria = num -> new StringBuilder(num).reverse().toString();
		Function<String, Integer>converterParaInteiro= num -> Integer.parseInt(num, 2);
		
		System.out.println("Original");
		nums.stream()
		.map(converterStringBinaria)
		.forEach(print);

		System.out.println("\nInvertida");
		nums.stream()
		.map(converterStringBinaria)
		.map(inverterStringBinaria)
		.forEach(print);
		
		System.out.println("\nConvertida");
		nums.stream()
			.map(converterStringBinaria)
			.map(inverterStringBinaria)
			.map(converterParaInteiro)
			.forEach(print);
	}
}
