package com.ygtech.cod3r.s12_Generics.a245;

class CaixaObjeto {
	private Object coisa;
	
	public void guardar(Object coisa) {
		this.coisa = coisa;
	}
	
	public Object abrir() {
		return coisa;
	}
}
