package br.com.newtonpaiva.trabalhoPOO;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        ArrayList <Cadastro> cadastro = new ArrayList <>();
        ArrayList<Cadastro> novoUsuarios = new ArrayList<>();
        Cadastro p1;
        Cadastro usuarioLogado = null;

        String proc=null;
        String proc1=null;

        int op;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("<1> Realizar cadastro\n<2> Entrar em conta\n<3> Sair"));

            switch (op) {
                case 1:

                    String nome=JOptionPane.showInputDialog(null,"Insira seu nome: ","Nome",JOptionPane.QUESTION_MESSAGE);
                    String sobrenome=JOptionPane.showInputDialog(null,"Insira seu sobrenome: ", "Sobrenome",JOptionPane.QUESTION_MESSAGE);
                    String email=JOptionPane.showInputDialog(null,"Insira seu email: ","Email",JOptionPane.QUESTION_MESSAGE);

                    String senha=null;
                    String confsenha=null;

                    try {
                        senha=JOptionPane.showInputDialog(null,"Insira uma senha: ","Senha",JOptionPane.QUESTION_MESSAGE);
                        confsenha=JOptionPane.showInputDialog(null,"Confirme a senha inserida: ","Confirmação de senha",JOptionPane.QUESTION_MESSAGE);
                        if (!senha.equals(confsenha)) {
                            throw new Exception("Senha não idêntica!!");
                        }

                        JOptionPane.showMessageDialog(null, "Parabéns\nCadastro Finalizado", "Cadastro", JOptionPane.INFORMATION_MESSAGE);

                    }catch(Exception ex) {
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    }

                    p1= new Cadastro(nome, sobrenome, email, senha, confsenha);
                    cadastro.add(p1);

                    break;

                case 2:

                        proc = JOptionPane.showInputDialog(null,"Email: ","Insira",JOptionPane.QUESTION_MESSAGE);
                        proc1 = JOptionPane.showInputDialog(null,"Senha: ", "Insira",JOptionPane.QUESTION_MESSAGE);

                    for (Cadastro c: cadastro) {

                        if ((c.getEmail().contains(proc)) && (c.getSenha().contains(proc1))) {
                            usuarioLogado = c;
                        }
                    }

                    if (usuarioLogado == null) { //erro no login
                        JOptionPane.showMessageDialog(null, "Usuário ou Senha não encontradas!!", "Problema", JOptionPane.ERROR_MESSAGE);
                       }
                    else { //Programa logado

                        JOptionPane.showMessageDialog(null, "Seja muito Bem-Vindo " + usuarioLogado.getNome(), "Bem-Vindo", JOptionPane.INFORMATION_MESSAGE);



                        int cont;
                        do {
                            cont = Integer.parseInt(JOptionPane.showInputDialog(null,"<1> Visualizar todos\n<2> Visualizar amigos\n<3> Adicionar amigos\n<4> Deletar amigos\n<5> Sair","Opções de navegação",JOptionPane.INFORMATION_MESSAGE ));
                            switch(cont) {

                                case 1:

                                    JOptionPane.showMessageDialog(null,c.getNome()+c.getSobrenome(),"Usuários Ativos",JOptionPane.INFORMATION_MESSAGE);

                                    break;

                                case 2:
                                    for (Cadastro n: novoUsuarios){

                                    }

                                    break ;

                                case 3:
                                    String proc2;

                                    proc2 = JOptionPane.showInputDialog("Insira o nome do usuário que deseja adicionar: ");
                                    if (c.getNome().contains(proc2)) ;
                                    novoUsuarios.add(c);
                                    JOptionPane.showMessageDialog(null,"Amigo Adicionado a sua lista de amigos.","Adicionado",JOptionPane.INFORMATION_MESSAGE);

                                    break;

                                case 4:
                                    String proc3;

                                    proc3 = JOptionPane.showInputDialog("Insira o nome do usuário que deseja adicionar: ");
                                    if (c.getNome().contains(proc3)) ;
                                    novoUsuarios.remove(c);

                                    break;

                            }
                        }while(cont!=5);
                    } //fim do programa logado




                    }

                    break;
                default:


        }while (op!=3);
    }



}