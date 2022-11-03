package br.com.newtonpaiva.pratica3.exer1;

public class Camarote extends Ingresso {
    private String localCamarote;
    private double valorAdicional;

    public Camarote(double valorIngresso, String localCamarote, double valorAdicional) {
        super(valorIngresso);
        this.localCamarote = localCamarote;
        this.valorAdicional = valorAdicional;
    }
    public String imprimeIngresso(){
        return "Ingresso Camarote: " + (getValorIngresso() + getValorAdicional() +"\n"+ getLocalCamarote());
    }

    public String getLocalCamarote() {
        return localCamarote;
    }

    public void setLocalCamarote(String localCamarote) {
        this.localCamarote = localCamarote;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
}