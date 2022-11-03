package br.com.newtonpaiva.pratica1.exer3;

public class NotasResultado {
	
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Ana", 123, 20, 30,0, "ADS", 3);
		System.out.println(aluno1.avaliarAluno());
		System.out.println(aluno1.avaliarRecuperacao());
		aluno1.aterarNotaAE(70);
		System.out.println("Alterar nota da Prva Especial");
		System.out.println(aluno1.avaliarRecuperacao());
	}
}