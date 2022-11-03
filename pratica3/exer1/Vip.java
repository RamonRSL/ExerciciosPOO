package br.com.newtonpaiva.pratica3.exer1;

public class Vip extends Ingresso{

	private double valorAdicional;

    public Vip(double valorIngresso, double valorAdicional) {
        super(valorIngresso);
        this.valorAdicional = valorAdicional;
    }
    

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
    public String imprimeIngresso(){
    	double total=getValorIngresso()+getValorAdicional();
        return "Ingresso VIP: " + total;
    }
}