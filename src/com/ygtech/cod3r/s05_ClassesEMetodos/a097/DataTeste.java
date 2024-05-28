package com.ygtech.cod3r.s05_ClassesEMetodos.a097;

class DataTeste {

	public static void main(String[] args) {

		Data d1 = new Data();
		d1.dia = 15;
		d1.mes = 11;
		d1.ano = 1990;
		
		var d2 = new Data();
		d2.dia = 13;
		d2.mes = 4;
		d2.ano = 1998;
		
		System.out.printf("Data de nascimento Yuri: %s.\n", d1.obterDataFormatada());
		System.out.printf("Data de nascimento Thalyta: %s.", d2.obterDataFormatada());

	}

}
