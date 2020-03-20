package cursojava.controle;

public class SwitchSemBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String faixa = "vermelha";
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai");
		case "marrom":
			System.out.println("Sei o Tekki SHodan");
		case "verde":
			System.out.println("Sei o Godan");
		case "laranja":
			System.out.println("Sei o Yodan");
		case "vermelha":
			System.out.println("Sei o Sandan");
		case "amarela":
			System.out.println("Sei o Nidan");
			default:
				System.out.println("nAo sei nada");
		}
		
		System.out.println("fim");
		
		int idade =3 ;
		switch(idade) {
		case 3: 
			System.out.println("sabe programar");
		case 2: 
			System.out.println("sabe falar");
		case 1: 
			System.out.println("sabe andar");
		case 0: 
			System.out.println("sabe respirar");
		}
	}

}
