package cursojava.controle;

import java.util.Scanner;

public class IF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a media: ");
		double media = entrada.nextDouble();
		
		if (media <=10 && media >= 7.0) {
			System.out.println("Aprovado");
			System.out.println("Parabens");
		}
		if(media <7 && media >= 4.5) {
			System.out.println("Recuperação");
		}
		if(media < 4.5 && media >= 0) {
			System.out.println("Reprovado");
		}
	entrada.close();
	}

}
