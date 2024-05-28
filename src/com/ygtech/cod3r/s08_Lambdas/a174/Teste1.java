package com.ygtech.cod3r.s08_Lambdas.a174;

class Teste1 {

	public static void main(String[] args) {

		Calculo calculo = new Somar();
		System.out.println(calculo.executar(2, 5));
		
		calculo = new Multiplicar();
		System.out.println(calculo.executar(2, 5));
		
		
	}

}
