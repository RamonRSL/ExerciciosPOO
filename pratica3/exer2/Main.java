package br.com.newtonpaiva.pratica3.exer2;

public class Main {

	public static void main(String[] args) {
		
		/*int matricula;
		String nome;
		double salario;
		double percentual;
		double vendas;
		double producao;
		*/
		
		FPadrao fp= new FPadrao(100, "Maria Fernanda", 2000);
		System.out.println("Total de proventos: " + fp.calcularProventos());
		
		FComissionado fc = new FComissionado(101,"Pedro", 2000, 1, 10000);
		System.out.println("Total de proventos comissionado: " + fc.calcularProventos());
		
		FProdutividade fpro =new FProdutividade(102, "Maria", 2000, 0.10, 10000);
		System.out.println("Total de proventos Produtividade: " + fpro.calcularProventos());
	
	}
	
}