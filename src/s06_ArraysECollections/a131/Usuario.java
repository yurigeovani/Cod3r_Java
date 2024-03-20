package s06_ArraysECollections.a131;

import java.util.Objects;

class Usuario {

	String nome;

	Usuario(String nome) {
		this.nome = nome;
	}

	Usuario() {
	}
	
	@Override
	public String toString() {
		return "Meu nome eh " + nome + ".";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(nome, other.nome);
	}
}
