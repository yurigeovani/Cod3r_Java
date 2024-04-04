package s08_Lambdas.a178;

import java.util.Arrays;
import java.util.List;

class Foreach {

	public static void main(String[] args) {
		
		List<String> aprovados = Arrays
				.asList("Ana", "Bia", "Lia", "Gui");
		
		System.out.println("Forma tradicional: ");
		for (String string : aprovados) {
			System.out.println(string);
		}
		
		System.out.println("\nLambda #01...");
		aprovados.forEach((nome)-> {System.out.println(nome);});
		
		System.out.println("\nLambda #01...");
		//se for apenas um parametro, não é obrigatório o uso de parenteses
		aprovados.forEach(nome-> {System.out.println(nome);});
		
		//se for apenas um retorno, 
		System.out.println("\nLambda #01...");
		
		//se tiver apenas uma sentença de código, pode tirar o par de chaves e ";"
		aprovados.forEach((nome)-> System.out.println(nome));
		
		System.out.println("\nMethod Reference #01...");
		aprovados.forEach(System.out::println);

		System.out.println("\nLambda #02...");
		aprovados.forEach(nome-> meuImprimir(nome));

		System.out.println("\nMethod Reference #02...");
		aprovados.forEach(Foreach::meuImprimir);
	}
	
	static void meuImprimir(String nome) {
		System.out.println("Oi, meu nome é " + nome);
	}
}
