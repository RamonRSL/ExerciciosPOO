package br.com.newtonpaiva.pratica2.exer2;
import java.util.Scanner;

public class Corpo {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		
		
		System.out.println("Digite o valor que deseja calcular: ");
		double vlInicial=ler.nextDouble();
		
		System.out.println("Insira a taxa de juros que será calculada: ");
		double txJuros = ler.nextDouble();
		
		
		System.out.println("Digite quantos meses que deseja render:");
		int nMeses=ler.nextInt();
		
		Rendimento rendimento1 = new Rendimento(vlInicial ,txJuros,nMeses);   // cria e instancia os parametros 
		
		System.out.println(rendimento1.calRendimento());
		
		
		
		
		
	}

}