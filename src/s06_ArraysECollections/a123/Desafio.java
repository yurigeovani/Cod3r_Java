package s06_ArraysECollections.a123;

import java.util.Arrays;
import java.util.Scanner;

class Desafio {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe a quantidade de notas: ");
		int qtdNotas = entrada.nextInt();

		double[] notas = new double[qtdNotas];

		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Digite a nota %d: ", (i + 1));
			notas[i] = entrada.nextDouble();
		}

		double total = 0;
		for (double nota : notas) {
			total += nota;
		}

		double media = total / notas.length;
		System.out.printf("A média é : %.2f\n", media);
		System.out.print("As notas foram: " + Arrays.toString(notas));
		entrada.close();
	}

}
