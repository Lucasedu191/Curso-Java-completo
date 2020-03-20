package cursojava.controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		
		while (!valor.equalsIgnoreCase("sair")) {
			System.out.println("voce diz: ");
			valor = entrada.nextLine();
		}
	}

}
