package cursojava01;

import java.util.Scanner;

/**
 * @author lucas
 *
 */
/**
 * @author lucas
 *
 */
public class Console {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.printf( "Nome: %s%n", "Joao");
		 Scanner entrada = new Scanner (System.in) ;
		 
		 System.out.printf("Digite seu nome: ");
		 String nome = entrada.nextLine();
		 
		 System.out.printf("Digite seu sobrenome: ");
		 String sobrenome = entrada.nextLine();
		 
		 System.out.printf("Digite sua idade: ");
		 int idade = entrada.nextInt();
		 
		 
		 
		 System.out.printf("\n\nNome = " + nome + " " + sobrenome);
		 System.out.printf("\n\nIdade = " + idade);
		 entrada.close();
		 }

}
