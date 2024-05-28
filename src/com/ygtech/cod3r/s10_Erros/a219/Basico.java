package com.ygtech.cod3r.s10_Erros.a219;


class Basico {

	public static void main(String[] args) {

		Aluno a1 = null;
		
		try {
			imprimirNomeDoAluno(a1);			
		} catch (Exception e) {
			System.out.println("Ocorreu um nome no momento de imprimir o nome do usuário: " + "\n\t" + e);
		}
		
		try {
			System.out.println(7/0);			
		} catch (ArithmeticException e) {
			System.out.println("Ocorreu um nome no momento da divisão: " + "\n\t" + e.getMessage());
		}
		
		System.out.println("Fim!");
	}
	
	public static void imprimirNomeDoAluno (Aluno aluno) {
		System.out.println(aluno.nome);
	}

}
