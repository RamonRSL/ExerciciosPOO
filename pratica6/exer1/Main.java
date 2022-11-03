package br.com.newtonpaiva.pratica6.exer1;
import javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) {
		
		String nome = null, email = null, telefone = null, dataEnt=null, rg = null, dp = null;
		double salario=0;
		boolean dent = false;
		
		Funcionario f = new Funcionario(nome, email, telefone, salario=0, dataEnt= null, rg, dp, dent);
		
		Funcionario []  vt = new Funcionario [100];
				
		for (int i=0; i<1 ; i++) {
		
		nome=JOptionPane.showInputDialog(null,"Digite o Nome do colaborador: ","Nome",JOptionPane.DEFAULT_OPTION);
		email=JOptionPane.showInputDialog(null,"Digite o Email: ","Email",JOptionPane.DEFAULT_OPTION);
		telefone=JOptionPane.showInputDialog(null,"Digite o Telefone: ","telefone",JOptionPane.DEFAULT_OPTION);
		dataEnt=JOptionPane.showInputDialog(null,"Digite a data de entrada: ","Data de entrada",JOptionPane.DEFAULT_OPTION);
		rg=JOptionPane.showInputDialog(null,"Digite o RG: ","RG",JOptionPane.DEFAULT_OPTION);
		dp=JOptionPane.showInputDialog(null,"Insira o departamento que o colaborador atua: ","Departamento",JOptionPane.DEFAULT_OPTION);
		salario=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o Salário: ","Salário",JOptionPane.DEFAULT_OPTION));
		dent=Boolean.parseBoolean(JOptionPane.showInputDialog(null,"O funcionario esta Ativo: ","Ativo",JOptionPane.DEFAULT_OPTION));
		
		vt[i]=new Funcionario(nome, email, telefone, salario, dataEnt, rg, dp, dent);
		
		JOptionPane.showConfirmDialog(null,vt[i].MostrarDados(),"Informação", JOptionPane.CLOSED_OPTION);
			
		}
		
		System.out.println("Dados: VT 1: " + vt[0].MostrarDados());
	}
}
