package cursojava.classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 4399.90;
		p1.desconto = 0.25;
		
		Produto p2 = new Produto();
		p2.nome = "Caneta";
		p2.preco = 10.00;
		p2.desconto = 0.29;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal1 = p1.preco * (1 - p1.desconto);
		double precoFinal2 = p2.preco * (1 - p2.desconto);
		
		System.out.println((precoFinal1 + precoFinal2) / 2);
		
		
	}
}
