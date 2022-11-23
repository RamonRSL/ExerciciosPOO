package br.com.newtonpaiva.trabalhoPOO;

public class NovoUsuario extends Cadastro{


    public NovoUsuario(String nome, String sobrenome, String email, String senha, String confsenha) {
        super(nome, sobrenome, email, senha, confsenha);
    }

       public String Mostrar1(){
        return getNome() + "\n"+ getSobrenome() + "\n";
      }

}
