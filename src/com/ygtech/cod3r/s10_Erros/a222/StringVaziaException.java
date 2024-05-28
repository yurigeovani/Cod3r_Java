package com.ygtech.cod3r.s10_Erros.a222;

@SuppressWarnings("serial")
class StringVaziaException extends RuntimeException {
	
	private String nomeDoAtributo;
	
	public StringVaziaException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessage() {
		return String.format("O atributo '%s' está vazio: ", nomeDoAtributo);
	}
}
