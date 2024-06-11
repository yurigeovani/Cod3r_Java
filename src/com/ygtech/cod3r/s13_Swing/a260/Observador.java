package com.ygtech.cod3r.s13_Swing.a260;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class Observador {

	public static void main(String[] args) {

		JFrame janela = new JFrame("Observador");
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		janela.setSize(600,200);
		janela.setLayout(new FlowLayout());
		janela.setLocationRelativeTo(null); // centralizar na tela do PC (caso seja passado algum componente como parametro, será centralizado no componente)
		
		JButton botao = new JButton("Clicar!");
		janela.add(botao);
		
		botao.addActionListener(e -> System.out.println("Evento ocorreu!"));
		
		janela.setVisible(true);
	}
}
