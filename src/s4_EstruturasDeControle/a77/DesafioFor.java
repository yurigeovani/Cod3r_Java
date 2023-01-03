package s4_EstruturasDeControle.a77;

public class DesafioFor {

	public static void main(String[] args) {

		String valor1 = "#";
		for(int i = 1; i <= 5; i++) {
			System.out.println(valor1);
			valor1 += "#";
		}

		// Versão do desafio
		// Não pode usar valor numérico pra controlar o laço!
		
		// Resolução do professor		
		for(String valor2 = "#"; !valor2.equals("######"); valor2 += "#") {
			System.out.println(valor2);
		}

		// Minha resolução
		String valor3 = "#";
		for (int i = 'a'; i <= 'e'; i++) {
			System.out.println(valor3);
			valor3 += "#";
		}
	}
}
