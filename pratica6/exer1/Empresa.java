package br.com.newtonpaiva.pratica6.exer1;

public class Empresa extends Funcionario{

	public Empresa(String nome, String email, String telefone, double salario, String dataEnt, String rg, String dp,
			boolean dent) {
		super(nome, email, telefone, salario, dataEnt, rg, dp, dent);
		
	}
	
	private String nome, cnpj, qtde_de_funcionario;	
	
	
	
	public Empresa(String nome, String email, String telefone, String nome2, String cnpj, String qtde_de_funcionario) {
		super(nome, email, telefone);
		nome = nome2;
		this.cnpj = cnpj;
		this.qtde_de_funcionario = qtde_de_funcionario;
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getQtde_de_funcionario() {
		return qtde_de_funcionario;
	}
	public void setQtde_de_funcionario(String qtde_de_funcionario) {
		this.qtde_de_funcionario = qtde_de_funcionario;
	}
	
	
	

}
