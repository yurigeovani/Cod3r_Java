package s12_Generics.a247;

public class CaixaIntTeste {

	public static void main(String[] args) {

		CaixaInt caixaA = new CaixaInt();
		caixaA.guardar(123);
		
		Integer coisaA = caixaA.abrir();
		System.out.println(coisaA);
	}

}