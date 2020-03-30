package oo.encapsulamento.casaA;

public class Pessoa {
	
	private int idade;
	private String Nome;
	
	public Pessoa(String nome, int idade) {
		setIdade(idade);
		setNome(nome);
	}
	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);
		if(novaIdade >= 0 && novaIdade <= 120) {
		this.idade = novaIdade;
		}
	}
	
	public String toString() {
		return "Olá eu sou o " + getNome()
		+ " e tenho " + getIdade() + " anos";
	}
}
