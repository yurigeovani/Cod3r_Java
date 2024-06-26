package com.ygtech.cod3r.s07_OO.a141;

class Carro {

	final Motor motor;
	
	public Carro() {
		this.motor = new Motor(this);
	}

	void acelerar() {
		motor.fatorInjecao += 0.4;
	}

	void frear() {
		if (motor.fatorInjecao > 0.5)
			motor.fatorInjecao -= 0.4;
	}

	void ligar() {
		motor.ligado = true;
	}

	void desligar() {
		motor.ligado = false;
	}

	boolean estaLigado() {
		return motor.ligado;
	}
}
