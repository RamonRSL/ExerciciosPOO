package br.com.newtonpaiva.pratica6.exer1;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Funcionario[] funcionarios = new Funcionario[2];
        Funcionario func;
        Empresa emp1;
        String nome, email, telefone, dp, dataEnt,rg, nomeEmpresa, cnpj;
        int qtde_de_funcionario;
        double salario;
        boolean dent=true;
        Scanner ler = new Scanner(System.in);

        for (int i=0 ; i<2;i++) {

            nome=JOptionPane.showInputDialog("Digite nome: ");
            telefone=JOptionPane.showInputDialog("Digite telefone: ");
            email=JOptionPane.showInputDialog("Digite email: ");
            dp=JOptionPane.showInputDialog("Digite depatamento: ");
            dataEnt=JOptionPane.showInputDialog("Digite data de entrada: ");
            rg=JOptionPane.showInputDialog("Digite o RG: ");
            salario=Double.parseDouble(JOptionPane.showInputDialog("Digite o salario: "));
            func = new Funcionario(nome, email, telefone, salario, dataEnt, rg,  dp, dent);
            funcionarios[i]=func;
        }

        nomeEmpresa=JOptionPane.showInputDialog("Digite nome da empresa: ");
        cnpj=JOptionPane.showInputDialog("Digite o CNPJ: ");
        qtde_de_funcionario=Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de pessoas: "));
        emp1 = new Empresa(nomeEmpresa, cnpj, qtde_de_funcionario);
        for (Funcionario func1: funcionarios) {
            emp1.inserirFuncionario(func1);
            System.out.println(func1.MostrarDados());
        }
   }
}

        /*
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


    }
}
*/
