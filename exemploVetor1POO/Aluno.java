package br.com.newtonpiva.exemploVetor1POO;

public class Aluno {
    private String aluno;
    private int mat;


    public Aluno(String aluno, int mat) {
        this.aluno = aluno;
        this.mat = mat;

    }

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public String mostrar (){
        return "\n"+"O nome do aluno é: "+ getAluno() + "\n" + "A matricula do aluno é: " + getMat() + "\n";
    }

}
