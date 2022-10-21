package br.com.newtonpiva.exemploVetor1POO;
import java.util.Scanner;
public class Main {
    public static void main (String Args[]){
        String nome, buscar;
        int mat = 0;

        Aluno [] alunos = new Aluno[10];
        Scanner ler = new Scanner(System.in);
        for (int i=0;i<10;i++){

            System.out.println("O indice do vetor é: " + i + "\n" + "Digite a matricula:");
            mat=ler.nextInt();

            ler = new Scanner(System.in);

            System.out.println("Digite o nome:");
            nome=ler.nextLine();

            alunos[i]= new Aluno(nome,mat);

            System.out.println (alunos[i].mostrar());

        }
        //buscar um nome específico no vetor .

            System.out.println("Digite o nome que deseja buscar no vetor: ");
            buscar=ler.nextLine();
        for (int i=0;i<10;i++){
            if (alunos[i].getAluno().equals(buscar)){
                System.out.println("O nome " + buscar + " foi encontrado no vetor " + i + "\n" + "e sua matricula é: " + alunos[i].getMat());
            }
        }
    }
}
