package com.ygtech.cod3r.s08_Lambdas.a174;

@FunctionalInterface
interface Calculo {

	// Não é obrigado pôr public abstract por já estar implícito
	//public abstract double executar(double a, double b);
	double executar(double a, double b);
	
	// é possível outro método, contanto que não seja abstrato
	default String legal() {
		return "Legal";
	}
	
	static String muitoLegal() {
		return "Muito Legal!";
	}
}
