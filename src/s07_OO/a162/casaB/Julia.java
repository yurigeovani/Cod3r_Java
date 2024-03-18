package s07_OO.a162.casaB;

import s07_OO.a162.casaA.Ana;

public class Julia {

	
	void testeAcessos() {
		Ana sogra = new Ana();
		
		//System.out.println(sogra.segredo); - Não consegue por ser privado
		//System.out.println(sogra.facoDentroDeCasa); - Não consegue por não estar no mesmo pacote 
		//System.out.println(sogra.formaDeFalar); - Não consegue por não herdar
		System.out.println(sogra.todosSabem); // Consegue porque é público 
	}
}
