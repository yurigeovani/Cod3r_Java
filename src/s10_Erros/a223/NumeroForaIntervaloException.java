package s10_Erros.a223;

@SuppressWarnings("serial")
class NumeroForaIntervaloException extends Exception {
	
	private String nomeDoAtributo;
	
	public NumeroForaIntervaloException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessage() {
		return String.format("O atributo '%s' está fora do intervalo!", nomeDoAtributo);
	}
}
