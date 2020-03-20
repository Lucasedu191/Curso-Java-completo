package cursojava.controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		
		int quantidadeNotas = 0;
		double nota = 0;
		double total = 0;
		
		while(nota != -1){
			System.out.print("Informe a nota: ");
			nota = entrada.nextDouble();
		if(nota <= 10 && nota >=0) {	
			total += nota;
			quantidadeNotas++;
		}else if (nota != -1) {
			System.out.println("Nota invalida");
		}
		}
		
		double media = total / quantidadeNotas;
		System.out.println("Media = " + media);
		
		entrada.close();
	}

}
