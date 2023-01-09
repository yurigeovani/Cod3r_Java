package s06_ArraysECollections.a127;

public class Usuario {

	String nome;
	String email;
	
	// EQUALS FEITO POR MIM
		public boolean equals(Object obj) {
		if(obj instanceof Usuario) {
			Usuario outro = (Usuario) obj;
			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean emailIgual = outro.email.equals(this.email);
			
			return nomeIgual && emailIgual;
		} else {
			return false;
		}
	}
	
	// EQUALS FEITO PELO ECLIPSE
	
//	@Override
//	public int hashCode() {
//		return Objects.hash(email, nome);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Usuario other = (Usuario) obj;
//		return Objects.equals(email, other.email) && Objects.equals(nome, other.nome);
//	}
	
}
