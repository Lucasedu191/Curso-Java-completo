package desafio;

public class Pessoa {
	
	String Nome;
	double peso;
	
	Pessoa (String nome, double peso){
		this.Nome = nome;
		this.peso = peso;
	}
	
	void comer(Comida comida) {
		if(comida != null) {
			this.peso += comida.peso;
		}
	}
	
	String apresentar() {
		return "olá sou" + nome + " tenho " + peso ; 
	}
}
