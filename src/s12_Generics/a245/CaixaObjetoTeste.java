package s12_Generics.a245;

class CaixaObjetoTeste {

	public static void main(String[] args) {
		
		CaixaObjeto caixaA = new CaixaObjeto();
		caixaA.guardar(2.3);
		
		Double coisaA = (Double)caixaA.abrir();
		System.out.println(coisaA);

		CaixaObjeto caixaB = new CaixaObjeto();
		caixaB.guardar("Ola mundo!");
		
		String coisaB = (String)caixaB.abrir();
		System.out.println(coisaB);
	}

}
