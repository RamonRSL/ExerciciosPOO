package br.com.newtonpaiva.JButton;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Layout extends JFrame{
	
	
	JButton b = new JButton("teste");
	
	public Layout() {
		setLayout (new BorderLayout());
		add(BorderLayout.NORTH,b);
		
		setTitle("Titulo da janela");
		setSize(700,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}

	public static void main(String[] args) {
	new Layout();
	}

}
