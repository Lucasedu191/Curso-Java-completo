package oo.heranca.desafio;

public class Ferrari extends Carro{

		Ferrari(){
			this(315);
		}
		
		Ferrari( int velocidadeMaxima){
			super(velocidadeMaxima);
			delta = 15;
		}
//		void acelerar() {
//			super.acelerar();
//		}
}