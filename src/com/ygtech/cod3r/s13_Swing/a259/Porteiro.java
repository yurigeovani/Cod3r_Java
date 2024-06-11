package com.ygtech.cod3r.s13_Swing.a259;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

class Porteiro {

	private List<ObservadorChegadaAniversariante> observadores = new ArrayList<>();
	
	public void registrarObservador(ObservadorChegadaAniversariante observador) {
		observadores.add(observador);
	}
	
	public void monitorar() {
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		
		while (!"sair".equalsIgnoreCase(valor)) {
			System.out.print("Aniversariante chegou?");
			valor = entrada.nextLine();
			
			if("sim".equalsIgnoreCase(valor)) {
				// criar o evento
				EventoChegadaAniversariante evento = new EventoChegadaAniversariante(new Date());

				// notificar os observers
				observadores.stream()
					.forEach(o -> o.chegou(evento));
				valor = "sair";
			} else {
				System.out.println("Alarme falso!");
			}
		}
		entrada.close();
	}
}
