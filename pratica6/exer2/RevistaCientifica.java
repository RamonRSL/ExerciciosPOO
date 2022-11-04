package br.com.newtonpaiva.pratica6.exer2;

public class RevistaCientifica {
    private String tituloRevista;
    private long issn;
    private String periodicidade;

    private Edicao edicoes;

    public RevistaCientifica(String tituloRevista, long issn, String periodicidade, Edicao edicoes) {
        this.tituloRevista = tituloRevista;
        this.issn = issn;
        this.periodicidade = periodicidade;
        this.edicoes = edicoes;
    }

    public String getTitulo() {
        return tituloRevista;
    }

    public void setTitulo(String tituloRevista) {
        this.tituloRevista = tituloRevista;
    }

    public long getIssn() {
        return issn;
    }

    public void setIssn(long issn) {
        this.issn = issn;
    }

    public String getPeriodicidade() {
        return periodicidade;
    }

    public void setPeriodicidade(String periodicidade) {
        this.periodicidade = periodicidade;
    }

    public void adicionarEdicao(){

    }
}