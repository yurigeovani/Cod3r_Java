package s07_OO.a143;

import java.util.ArrayList;
import java.util.List;

class Aluno {

	final String nome;
	final List<Curso> cursos = new ArrayList<>();

	Aluno(String nome) {
		this.nome = nome;
	}

	void addCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}

	Curso obterCursoPorNome(String nome) {
		for (Curso curso : this.cursos) {
			if (curso.nome.equalsIgnoreCase(nome))
				return curso;
		}
		return null;
	}

	@Override
	public String toString() {
		return this.nome;
	}
}
