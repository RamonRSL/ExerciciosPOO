package br.com.newtonpaiva.trabalhoPOO;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		
		ArrayList <Mae> cadastro = new ArrayList <>();
		Mae p1;
		String proc=null;
				
		int op;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog("<1> Realizar cadastro\n <2> Entrar em conta\n <3> Adicionar amigos\n <4> Visualizar amigos\n <5> Sair" ));
			
			switch (op) {
		case 1: 
		
		String nome=JOptionPane.showInputDialog("Insira seu nome: ");
		String sobrenome=JOptionPane.showInputDialog("Insira seu sobrenome: ");
		String email=JOptionPane.showInputDialog("Insira seu email: ");
		
		String senha=null;
		String confsenha=null;
		
			try {
			senha=JOptionPane.showInputDialog("Insira uma senha: ");
			confsenha=JOptionPane.showInputDialog("Confirme a senha inserida: ");
			if (!senha.equals(confsenha)) {
				throw new Exception("Senha não idêntica!!");
			}
			
			JOptionPane.showMessageDialog(null, "Parabéns\nCadastro Finalizado", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
			
			}catch(Exception ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage());
			}
			
		
			
			
			p1= new Mae(nome, sobrenome, email, senha, confsenha);
			cadastro.add(p1);
		
		
		
		break;
		
		case 2:
			for (Mae c: cadastro) {
				System.out.println(c);
			}
			/*for (int i=0; i < cadastro.size(); i++) {
				proc = JOptionPane.showInputDialog("Insira seu usuário: ");
				
				if (cadastro.get(i).getNome().contains(proc)) {
					try {
						String senha=JOptionPane.showInputDialog("Insira uma senha: ");
						
						if (!senha.equals(cadastro)) {
							throw new Exception("Senha não idêntica!!");
						}
						
						JOptionPane.showMessageDialog(null, "Parabéns\nCadastro Finalizado", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
						
						}catch(Exception ex) {
						JOptionPane.showMessageDialog(null, ex.getMessage());
						}	
					}
				}*/
				
			
			break;
			
		
		case 3:
		
		}
		}while (op!=5);
	}
	
	

}
