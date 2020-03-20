package cursojava.operadores;

public class DesafioLogicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Trabalho na terça
		//Trabalho na segunda
		
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		
		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean comprouTV32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		boolean maisSaudavel = !comprouSorvete;
		
		System.out.println("Comprou TV 50\" ? "+ comprouTV50);
		System.out.println("Comprou TV 32\" ? "+ comprouTV32);
		System.out.println("Comprou Sorvete ? "+ comprouSorvete);
		
		System.out.println("Mais saudavel? " + !comprouSorvete);
	}

}
