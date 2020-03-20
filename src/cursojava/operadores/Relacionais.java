package cursojava.operadores;

public class Relacionais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 97;
		int b = 'a';
		
		System.out.println(a == b);
		System.out.println('\u0061');
		System.out.println(3 > 4);
		System.out.println(3 >= 3);
		System.out.println(3 < 7);
		System.out.println(30 <= 7);
		System.out.println(30 != 7);
		
		double nota = 7.3;
		boolean bomCOmportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomCOmportamento && passouPorMedia;
		
		System.out.println("Tem desconto?" + temDesconto);
	}

}
