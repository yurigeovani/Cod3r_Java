package s07_OO.a162.casaB;

import s07_OO.a162.casaA.Ana; //por estar em outro pacote, é preciso importar.

class Pedro extends Ana{

	void testeAcessos() {
		Ana mae = new Ana();
		
		//System.out.println(mae.segredo); - não consegue pq o atributo segredo está como private
		//System.out.println(mae.facoDentroDeCasa); - não consegue pq está fora do package, mesmo o tendo importado
		//System.out.println(mae.formaDeFalar); - não consegue acessar pq está tentando acessar a partir de uma instancia da Ana e não por herança
		System.out.println(formaDeFalar); // conseguem acessar por causa da herança
		System.out.println(todosSabem);
	}
}
