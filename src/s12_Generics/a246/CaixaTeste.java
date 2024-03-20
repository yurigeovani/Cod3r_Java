package s12_Generics.a246;

class CaixaTeste {

	public static void main(String[] args) {

		Caixa<String> caixaA = new Caixa<>();
		caixaA.guardar("Segredo");
		
		String coisaA = caixaA.abrir();
		System.out.println(coisaA);
		
		Caixa<Double> caixaB = new Caixa<>();
		caixaB.guardar(2.3);
		
		Double coisaB = caixaB.abrir();
		System.out.println(coisaB);
		
	}

}
