package com.ygtech.cod3r.s07_OO.a141;

class Motor {
	
	final Carro carro;
	boolean ligado = false;
	double fatorInjecao = 1;
	
	Motor(Carro carro) {
		this.carro = carro;
	}

	int giros() {
		if(!ligado)
			return 0;
		else
			return (int)Math.round(fatorInjecao * 3000);
	}
}
