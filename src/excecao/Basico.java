package excecao;

public class Basico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno a1 = null;
		
		imprimirNomeDoAluno(a1);
		
		System.out.println(7 /0);
		System.out.println("Fim :)");
		
	}
	public static void imprimirNomeDoAluno(Aluno aluno) {
		System.out.println(aluno.nome);
	}

}
