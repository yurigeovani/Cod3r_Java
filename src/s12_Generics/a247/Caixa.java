package s12_Generics.a247;

class Caixa<T> {

	private T coisa;

	public void guardar(T coisa) {
		this.coisa = coisa;
	}

	public T abrir() {
		return coisa;
	}
}
