package br.com.newtonpaiva.JButton;


import javax.swing.JButton;
import javax.swing.JFrame;                                     //posições North(norte), west(esquerda), center(centro), east (direita) south(sul)
import javax.swing.JLabel;
import java.awt.Label;
import javax.swing.JOptionPane;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExJFrames implements ActionListener{
	int posicao = 40;
	
	JFrame frame = new JFrame();
	//JButton button = new JButton();							//como parametro pode ou nao receber um nome para o botão
	//números 
	JButton b0 = new JButton("0");
	JButton b1 = new JButton("1");
	JButton b2 = new JButton("2");
	JButton b3 = new JButton("3");
	JButton b4 = new JButton("4");
	JButton b5 = new JButton("5");
	JButton b6 = new JButton("6");
	JButton b7 = new JButton("7");
	JButton b8 = new JButton("8");
	JButton b9 = new JButton("9");
	JButton b10 = new JButton("/");
	JButton b11 = new JButton("*");
	JButton b12 = new JButton("-");
	JButton b13 = new JButton("+");
	JButton b14 = new JButton(",");
	JButton b15 = new JButton("=");
	JButton b16 = new JButton("C");
	JButton b17 = new JButton("CE");
	JButton b18 = new JButton("%");
	
	public void actionPerformed (ActionEvent e) {         //fazer com que quando clicar em um botão abrir uma caixa de dialogo 
		if (e.getSource() == b0) {
			
			posicao +=20;
			JLabel label = new JLabel();
			label.setText("0");
			label.setSize(100,100);
			label.setLocation(posicao,40);
			label.add(label);
			label.setVisible(true);
			//JOptionPane.showMessageDialog(null,"0" );
		}
		if (e.getSource()==b1) {
			
		}
	}
	
	
	/*public void adicionaLabel() {
	JLabel label = new JLabel();
	label.setText("0");
	label.setSize(10,10);
	label.setLocation(0,0);
	button.add(label);
	label.setVisible(true);
		}*/
				
	public void Botao() {
		
		//button.addActionListener(this);	
		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		b14.addActionListener(this);
		b15.addActionListener(this);
		b16.addActionListener(this);
		b17.addActionListener(this);
		b18.addActionListener(this);
		
		//button.setSize(20,40);
		
		
		//button.setBounds(10,10,430,150);									//(posição Horizontal, posição vertical, largura, tamanho) definir tamanho e posição 4 parametros 
		//números
		b7.setBounds(10,220,100,40);
		b4.setBounds(10,270,100,40);
		b1.setBounds(10,320,100,40);
		b8.setBounds(120,220,100,40);
		b5.setBounds(120,270,100,40);
		b2.setBounds(120,320,100,40);
		b0.setBounds(120,370,100,40);
		b9.setBounds(230,220,100,40);
		b6.setBounds(230,270,100,40);
		b3.setBounds(230,320,100,40);
		
		//caracter
		
		b10.setBounds(340,170,100,40);   // /
		b11.setBounds(340,220,100,40);   // *
		b12.setBounds(340,270,100,40);   // -
		b13.setBounds(340,320,100,40);   // +
		b14.setBounds(230,370,100,40);   // ,
		b15.setBounds(340,370,100,40);   // =
		b16.setBounds(10,170,100,40);   // C
		b17.setBounds(120,170,100,40);   // CE
		b18.setBounds(230,170,100,40);   // %
		
	//	frame.getContentPane().add(button);
		frame.getContentPane().add(b0);
		frame.getContentPane().add(b1);
		frame.getContentPane().add(b2);
		frame.getContentPane().add(b3);
		frame.getContentPane().add(b4);
		frame.getContentPane().add(b5);
		frame.getContentPane().add(b6);
		frame.getContentPane().add(b7);
		frame.getContentPane().add(b8);
		frame.getContentPane().add(b9);
		frame.getContentPane().add(b10);
		frame.getContentPane().add(b11);
		frame.getContentPane().add(b12);
		frame.getContentPane().add(b13);
		frame.getContentPane().add(b14);
		frame.getContentPane().add(b15);
		frame.getContentPane().add(b16);
		frame.getContentPane().add(b17);
		frame.getContentPane().add(b18);
		
		frame.setLayout(null);											//ele nega a posição automatica do layout do botão para acrescentar manualmente 
		frame.setTitle("Calculadora");									//nome da janela 
		frame.setSize(470,500);											//tamanho da janela
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			// fechar o programa e encerrar execução
		frame.setLocationRelativeTo(null);								//serve para centralizar a janela          setLocation escolhe onde posicionar a tela 
	 	frame.setResizable(false);                                      // bloqueia a tela para não de redimensionada pelo usuário
		frame.setVisible(true);											//tornar janela visível
		
	}
	
	public static void main (String [] Args) {		
		ExJFrames fx = new ExJFrames();
		fx.Botao();
		
	}
}
