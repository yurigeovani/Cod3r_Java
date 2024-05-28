package com.ygtech.cod3r.s06_ArraysECollections.a125;

import java.util.Arrays;
import java.util.Scanner;

class Matriz {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe a quantidade de alunos: ");
		int qtdAlunos = entrada.nextInt();
		System.out.print("Informe a quantidade de notas por aluno: ");
		int qtdNotas = entrada.nextInt();

		double[][] notasDaTurma = new double[qtdAlunos][qtdNotas];

		double total = 0;

		for (int a = 0; a < notasDaTurma.length; a++) {
			for (int n = 0; n < notasDaTurma[a].length; n++) {
				System.out.printf("Aluno %d, nota %d: ", a + 1, n + 1);
				notasDaTurma[a][n] = entrada.nextDouble();

				total += notasDaTurma[a][n];
			}
		}

		double media = total / (qtdAlunos * qtdNotas);

		System.out.printf("A media da turma eh %.2f: \n", media);

		for (double[] notasPorAluno : notasDaTurma) {
			System.out.println(Arrays.toString(notasPorAluno));
		}

		entrada.close();
	}

}
