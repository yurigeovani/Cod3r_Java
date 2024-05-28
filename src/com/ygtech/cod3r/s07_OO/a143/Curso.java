package com.ygtech.cod3r.s07_OO.a143;

import java.util.ArrayList;
import java.util.List;

class Curso {

	final String nome;
	final List<Aluno> alunos = new ArrayList<>();
	
	Curso(String nome) {
		this.nome = nome;
	}

	void addAluno(Aluno aluno) {
		this.alunos.add (aluno);
		aluno.cursos.add(this);
	}
}
