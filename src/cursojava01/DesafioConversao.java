package cursojava01;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		System.out.println("Informe o primeiro salario: ");
		String valor1 = entrada.next().replace(",",".");
		System.out.println("\nInforme o segundo salario: ");
		String valor2 = entrada.next().replace(",",".");
		System.out.println("\nInforme o terceiro salario: ");
		String valor3 = entrada.next().replace(",",".");
		
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double media = (salario1 + salario2 + salario3) /3;
		System.out.println("A media dos salarios é " + media);
		
		entrada.close();
	}

}
