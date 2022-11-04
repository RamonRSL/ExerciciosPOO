package br.com.newtonpaiva.pratica6.exer1;

public class Funcionario extends Pessoa{
    private double salario;
    private String dataEnt, rg, dp;  // dp = departamento trabalhando
    private boolean dent;

    public Funcionario(String nome, String email, String telefone, double salario, String dataEnt, String rg, String dp, boolean dent) {
        super(nome, email, telefone);
        this.salario = salario;
        this.dataEnt = dataEnt;
        this.rg = rg;
        this.dp = dp;
        this.dent = dent;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getDataEnt() {
        return dataEnt;
    }
    public void setDataEnt(String dataEnt) {
        this.dataEnt = dataEnt;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getDp() {
        return dp;
    }
    public void setDp(String dp) {
        this.dp = dp;
    }
    public boolean isDent() {
        return dent;
    }
    public void setDent(boolean dent) {
        this.dent = dent;
    }

    public void bonificar(double bonus) {
        this.salario+= this.salario + bonus;
    }


    public void Demitir() {
        this.dent=false;
    }

    public String MostrarDados() {

        return "Nome do funcionário: " + getNome() + "\nRG: " + getRg() + "\nTelefone: " + getTelefone() + "\nEmail: " + getEmail() +"\nDepartamento: " + getDp() + "\nData de entrada: " + getDataEnt()+ "\nSalario: " + getSalario() + "\nEfetivo? " + isDent();

    }
}