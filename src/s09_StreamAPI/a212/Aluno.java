package s09_StreamAPI.a212;

class Aluno {
	
	final String nome;
	final double nota;
	final boolean bomComportamento;

	public Aluno(String nome, double nota, boolean bomComportamento) {
		super();
		this.nome = nome;
		this.nota = nota;
		this.bomComportamento = bomComportamento;
	}

	public Aluno(String nome, double nota) {
		this(nome, nota, true);
	}

	@Override
	public String toString() {
		return nome + " tem nota " + nota + "!";
	}
	
	
}