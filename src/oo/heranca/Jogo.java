package oo.heranca;

public class Jogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monstro j1 = new Monstro();
		j1.x =10;
		j1.y =10;
		
		Heroi j2 = new Heroi();
		j2.x =10;
		j2.y =11;
		System.out.println(j1.vida);
		System.out.println(j2.vida);
		
		j1.atacar(j2);
		
		System.out.println(j1.vida);
		System.out.println(j2.vida);
	}

}
