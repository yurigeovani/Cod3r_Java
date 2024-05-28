package com.ygtech.cod3r.s03_Fundamentos;

class TiposPrimitivos {

	public static void main(String[] args) {

		//Informações do funcionário

		// Tipos numéricos de inteiros:
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_869_223L;
		
		// Tipos numéricos reais
		float salario = 11_445.55F;
		double vendasAcumuladas = 2_991_997_103.01;
		
		// TIpo booleano
		boolean estaDeFerias = false; // ou true
		
		// Tipo caractere
		char status = 'A';
		
		// Dias de empresa
		System.out.println(anosDeEmpresa*365);
		
		// Numeros de viagens
		System.out.println(numeroDeVoos/2);
		
		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		// ID ganha salario
		System.out.println(id + " ganha: R$ " + salario);
		
		// ID de ferias
		System.out.println(id + " esta de ferias? " + estaDeFerias);
		
		// ID status
		System.out.println(id + " status: " + status);
	}
}