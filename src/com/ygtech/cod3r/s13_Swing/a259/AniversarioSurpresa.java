package com.ygtech.cod3r.s13_Swing.a259;

class AniversarioSurpresa {

	public static void main(String[] args) {

		// Não seria necessário instanciar após a criação da interface funcional ObservadorChegadaAniversariante
		Namorada namorada = new Namorada();
		Porteiro porteiro = new Porteiro();
		
		 porteiro.registrarObservador(namorada);
		 //Assim: 
		 //porteiro.registrarObservador(e -> System.out.println("Surpresa via Lambda!\nOcorreu em " + e.getMomento()));
		 
		 //Ou assim:
		 porteiro.registrarObservador(e -> {
			 System.out.println("Surpresa via Lambda!");
			 System.out.println("Ocorreu em " + e.getMomento());
		 });
		porteiro.monitorar();

	}

}
