package cursojava.operadores;

public class Atribuicao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		int b = a;
		int c = a+b;
		
		//c = c + b;
		
		c += b;
		c -= a;
		c *= b;
		c /= a;
		c %= 2;
		
		System.out.println(c);
	}

}
