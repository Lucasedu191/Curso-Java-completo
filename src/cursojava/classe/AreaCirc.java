package cursojava.classe;

public class AreaCirc {
	double raio;
	static double PI = 3.14;
	
	AreaCirc(double raioInicial){
		//pi = 3.14;
		raio = raioInicial;
	}
	
	double area() {
		return PI * Math.pow(raio, 2);
	}
}
