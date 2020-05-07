package Swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame janela = new JFrame("Observador");
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		janela.setSize(600, 200);
		janela.setLayout(new FlowLayout());
		janela.setLocationRelativeTo(null);
		
		JButton botao = new JButton("Clicar!");
		janela.add(botao);
		janela.setVisible(true);
		
		botao.addActionListener(e -> {
		System.out.println("Evento ocorreu!!!");	
			
			});
		 
		
		janela.setVisible(true);
	}

}
