package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> fila = new LinkedList<>();
		//Offer e Add -> adicionam elementos na fila
		
		//Diferença é o comportamento ocorre
		// quando a fila está cheia
		fila.add("Camila");// retorna false
		fila.offer("Janaina");//lança uma exceção
		fila.add("Adriana");
		fila.offer("Juliana");
		fila.add("Luciana");
		fila.offer("Mariana");
		
		//Peek e Element -> obter o proximo elementos
		//da fila (sem remover)
		
		//diferença é o comportamento ocorre
		//quando a fila está vazia
		
		System.out.println(fila.peek());//retorna false
		System.out.println(fila.peek());
		System.out.println(fila.element());//lança uma exceção
		System.out.println(fila.element());
		System.out.println(fila.poll());// retorna null
		System.out.println(fila.remove());// lança uma exceção
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		
		//fila.size();
		//fila.clear();
		//fila.isEmpty();
		//fila.contains(...);
	}

}
