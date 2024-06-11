package com.ygtech.cod3r.s07_OO.a166;

class Comida {
	
	private double peso;

	public Comida(double peso) {
		setPeso(peso);
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if(peso>=0)
			this.peso = peso;
	}	
}