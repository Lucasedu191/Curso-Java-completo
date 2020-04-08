package lambdas;

import java.util.function.Function;

import com.sun.org.apache.xpath.internal.operations.And;

public class Funcao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Impar";

		Function<String, String> oResultadoE = valor -> "O resultado é: " + valor;

		Function<String, String> empolgado = valor -> valor + "!!!";

		String resultadoFinal = parOuImpar
				.andThen(oResultadoE)
				.andThen(empolgado)
				.apply(32);

		System.out.println(resultadoFinal);
		System.out.println(parOuImpar.apply(32));
	}

}
