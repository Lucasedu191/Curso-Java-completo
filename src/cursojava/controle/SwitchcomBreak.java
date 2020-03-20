package cursojava.controle;

import java.util.Scanner;

public class SwitchcomBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		String conceito = "";
		System.out.println("Informe a nota: ");
		
		int nota = entrada.nextInt();
		
		switch(nota) {
		 case 9:
		 conceito = "A";
		 	break;
		 case 7:
			 conceito = "B";
			 break;
		 case 5:
			 conceito = "C";
			 break;
		 case 3:
			 conceito = "D";
			 break;
		 case 1:
			 conceito = "E";
			 break;
		default:
			conceito = "não informado";
			
		}
	}

}
