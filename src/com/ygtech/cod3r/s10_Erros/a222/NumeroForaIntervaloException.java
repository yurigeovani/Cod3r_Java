package com.ygtech.cod3r.s10_Erros.a222;

@SuppressWarnings("serial")
class NumeroForaIntervaloException extends RuntimeException {
	
	private String nomeDoAtributo;
	
	public NumeroForaIntervaloException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessage() {
		return String.format("O atributo '%s' está fora do intervalo!", nomeDoAtributo);
	}
}
