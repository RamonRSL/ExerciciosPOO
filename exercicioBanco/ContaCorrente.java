package br.com.newtonpaiva.exercicioBanco;

public class ContaCorrente extends Conta {

	private double limite;

	public ContaCorrente(String numConta, double saldo, double limite) {
		super(numConta, saldo);
		this.limite = limite;
	}

	
	public double consultaSaldoTotal()
	{
		return this.limite + getSaldo();
	}
	
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	
}