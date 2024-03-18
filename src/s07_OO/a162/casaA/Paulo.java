package s07_OO.a162.casaA;

public class Paulo {
	
	void testeAcessos() {
		Ana esposa = new Ana();
		//System.out.println(esposa.segredo); - não consegue acessar pq o atributo é privado
		System.out.println(esposa.facoDentroDeCasa); // consegue ver pq está como defacult (package)
		System.out.println(esposa.formaDeFalar); // também consegue ver, não pq herda da Ana, mas pq está dentro do mesmo package
		System.out.println(esposa.todosSabem); // É público, portanto, todos vêem
	}
}
