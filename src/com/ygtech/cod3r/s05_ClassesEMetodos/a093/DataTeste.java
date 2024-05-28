package com.ygtech.cod3r.s05_ClassesEMetodos.a093;

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
		
		System.out.printf("Data de nascimento Yuri: %d/%02d/%d.\n", d1.dia,d1.mes,d1.ano);
		System.out.printf("Data de nascimento Thalyta: %d/%02d/%d.", d2.dia,d2.mes,d2.ano);
	}

}
