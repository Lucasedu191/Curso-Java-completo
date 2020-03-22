package colecoes;

import java.util.ArrayList;

public class LIsta {
	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario ("Ana");
		lista.add(u1);
				
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Andreia"));
		lista.add(new Usuario("Fabiana"));

		System.out.println(lista.get(2).nome);
		
		lista.remove(1);
		lista.remove(new Usuario ("Bia"));
		
		for(Usuario u: lista) {
			System.out.println(u);
		}
		
	}
}
