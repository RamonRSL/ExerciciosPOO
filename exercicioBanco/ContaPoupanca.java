package br.com.newtonpaiva.exercicioBanco;

public class ContaPoupanca extends Conta {
	
	private double rendimento;

	public ContaPoupanca(String numConta, double saldo, double rendimento) {
		super(numConta, saldo);
		this.rendimento = rendimento;
	}

	
	public void atualizarRendimento() {
		setSaldo(getSaldo()*rendimento/100+getSaldo());
	
	}
	
	public double getRendimento() {
		return rendimento;
	}

	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}
	

}