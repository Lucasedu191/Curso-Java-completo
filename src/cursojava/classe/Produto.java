package cursojava.classe;

public class Produto {
	String nome;
	double preco;
	double desconto;
	
	Produto(String nomeInicial){
		nome = nomeInicial;
	}
	Produto(String nomeInicial, double precoInicial, double descontoInicial){
		nome = nomeInicial;
		preco = precoInicial;
		desconto = descontoInicial;
		
	}
	
	double precoComDesconto(double descontoGerente) {
		return preco * (1 - desconto + descontoGerente);
				
	}
}
