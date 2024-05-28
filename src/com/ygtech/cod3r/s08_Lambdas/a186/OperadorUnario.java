package com.ygtech.cod3r.s08_Lambdas.a186;

import java.util.function.UnaryOperator;

class OperadorUnario {

	public static void main(String[] args) {

		UnaryOperator<Integer> maisDois = n -> n+2;
		UnaryOperator<Integer> vezesDois = n -> n*2;
		UnaryOperator<Integer> aoQuadrado = n -> n*n;
		
		int result1 = maisDois.andThen(vezesDois).andThen(aoQuadrado).apply(2);
		System.out.println(result1);

		int result2 = maisDois.andThen(vezesDois).andThen(aoQuadrado).apply(20);
		System.out.println(result2);
		
		int result3 = maisDois.compose(vezesDois).compose(aoQuadrado).apply(2);
		System.out.println(result3);
		
		int result11 = aoQuadrado.compose(vezesDois).compose(maisDois).apply(2);
		System.out.println(result11);
		
	}

}
