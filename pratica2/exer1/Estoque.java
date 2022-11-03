package br.com.newtonpaiva.pratica2.exer1;

public class Estoque {

	private String nome;
	private int qtdAtual;         //atributos da classe.
	private int qtdMinima;
	
	
	public Estoque () {	
	}
	
	public Estoque(String nome, int qtdAtual, int qtdMinima) {
		super();
		this.nome = nome;
		this.qtdAtual = qtdAtual;                                 
		this.qtdMinima = qtdMinima;				
	}
	
	
	public void darBaixa(int qtde) {	
		if (qtde <= this.qtdAtual)  
			this.qtdAtual-=qtde;
		else
			System.out.println("quantidade invalida."); 
	}	
	
	public boolean precisaRepor() {
		
		if (this.qtdAtual <= this.qtdMinima)
			return true;
		else
			return false;	
	}
	
	public String mostra() {
		return "produto" + getNome() + "\n qtdAtual:" + getQtdAtual() + "\nEstoqueMinimo: " + getQtdMinima();
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQtdAtual() {
		return qtdAtual;
	}

	public void setQtdAtual(int qtdAtual) {
		this.qtdAtual = qtdAtual;
	}

	public int getQtdMinima() {
		return qtdMinima;
	}

	public void setQtdMinima(int qtdMinima) {
		this.qtdMinima = qtdMinima;
	}
		
}