package com.ygtech.cod3r.s13_Swing.a259;

class Namorada implements ObservadorChegadaAniversariante{

	public void chegou(EventoChegadaAniversariante e) {
		System.out.println("Avisar os convidados...");
		System.out.println("Apagar as luzes...");
		System.out.println("Esperar um pouco...");
		System.out.println("e... surpresa!!!");
	}

}
