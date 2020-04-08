package lambdas;

public class CalculoTeste1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculo calculo = new Soma();
		System.out.println(calculo.executar(2, 3));
		Multiplicar multiplica = new Multiplicar(); 
		System.out.println(multiplica.executar(2, 3));
		
	}

}
