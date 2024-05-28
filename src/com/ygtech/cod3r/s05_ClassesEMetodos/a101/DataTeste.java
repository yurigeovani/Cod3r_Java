package com.ygtech.cod3r.s05_ClassesEMetodos.a101;

class DataTeste {

	public static void main(String[] args) {

		Data d1 = new Data();
		
		var d2 = new Data(13,4,1998);
		
		System.out.printf("Data de nascimento Yuri: %s.\n", d1.obterDataFormatada());
		System.out.printf("Data de nascimento Thalyta: %s.", d2.obterDataFormatada());

	}
}