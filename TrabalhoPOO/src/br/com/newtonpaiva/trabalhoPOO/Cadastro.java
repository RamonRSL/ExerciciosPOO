package br.com.newtonpaiva.trabalhoPOO;

public class Cadastro {
        private String nome, sobrenome, email, senha, confsenha;

        public  Cadastro ( String nome, String sobrenome, String email, String senha, String confsenha ) {
            super ();
            this.nome = nome;
            this.sobrenome = sobrenome;
            this.email = email;
            this.senha = senha;
            this.confsenha = confsenha;
        }

        public  String  getNome () {
            return  nome ;
        }

        public  void  setNome ( String nome) {
            this.nome = nome ;
        }
        public  String  getSobrenome () {
            return  sobrenome ;
        }

        public  void  setSobrenome ( String sobrenome) {
            this.sobrenome = sobrenome ;
        }
        public  String  getEmail () {
            return  email ;
        }

        public  void  setEmail ( String email) {
            this.email = email ;
        }
        public  String  getSenha () {
            return  senha ;
        }

        public  void  setSenha ( String senha) {
            this.senha = senha ;
        }
        public  String  getConfsenha () {
            return  confsenha ;
        }

        public  void  setConfsenha ( String confsenha) {
            this.confsenha = confsenha ;
        }

        public String Mostrar() {
            return getNome()+"\n"+ getSobrenome()+"\n"+getEmail();
        }
 }


