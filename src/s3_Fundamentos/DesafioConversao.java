package s3_Fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o salario 1: ");
		String salario1 = entrada.nextLine().replace(',', '.');
		
		System.out.print("Informe o salario 2: ");
		String salario2 = entrada.nextLine().replace(',', '.');
		
		System.out.print("Informe o salario 3: ");
		String salario3 = entrada.nextLine().replace(',', '.');
		
		double media = 
			   (Double.parseDouble(salario1) + 
				Double.parseDouble(salario2) + 
				Double.parseDouble(salario3))/3;
		System.out.printf("Media: %.2f", media);
		
		entrada.close(); 
	}

}
