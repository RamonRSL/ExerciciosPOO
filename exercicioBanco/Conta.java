package br.com.newtonpaiva.exercicioBanco;

public class Conta {
	
	private String numConta;
	private double saldo;
	public Conta(String numConta, double saldo) {
		super();
		this.numConta = numConta;
		this.saldo = saldo;
	}
	
	
	public void depositar (double valor) {	
	this.saldo+=valor;
		
	}
	
	public void sacar (double valor) {
		if (valor<=this.saldo)
			this.saldo-=valor;		
	}
	
	
	
	public String getNumConta() {
		return numConta;
	}
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	

}
