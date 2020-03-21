package cursojava.classe;

public class Data {
	int dia;
	int mes;
	int ano;
	
	
	Data(){
		//dia = 1;
		//mes = 1;
		//ano = 1970;
		
		this(1, 1, 1970);
		
		//objetos -> null
		
		int a;
		
		a = 0;
		System.out.println(a);
	}
	
	Data(int diaInicial, int mesInicial, int anoInicial){
		this.dia = diaInicial;
		this.mes = mesInicial;
		this.ano = anoInicial;
	}
	
	String obterDataFormatada() {
		final String formato = "%d/%d/%d";
		return String.format(formato, this.dia ,this.mes ,this.ano);
	}
	
	
}
