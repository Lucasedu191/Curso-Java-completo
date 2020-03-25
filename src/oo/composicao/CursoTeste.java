package oo.composicao;

public class CursoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno aluno1 = new Aluno("Joao");
		Aluno aluno2 = new Aluno("Maria");
		Aluno aluno3 = new Aluno("Pedro");
		
		Curso curso1 = new Curso("Java Completo");
		Curso curso2 = new Curso("Web2023");
		Curso curso3 = new Curso("React native");
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno3);
		
		aluno1.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);
		
		for(Aluno aluno: curso1.alunos) {
			System.out.println("Estou matriculado no curso 1 ..");
			System.out.println("e o meu nome é" + aluno.nome);
			System.out.println();
		}
	}

}
