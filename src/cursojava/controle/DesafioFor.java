package cursojava.controle;

public class DesafioFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String valor = "#";
		for(int i =1; i <= 5; i++) {
			System.out.println(valor);
			valor += "#";
			
			// n�o pode usar valor numerico para controlar o la�o
			
			for(String v = "#"; !v.equals("######"); v += "#") {
				System.out.println(v);
			}
		}
	}

}
