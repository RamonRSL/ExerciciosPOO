package br.com.newtonpaiva.pratica2.exer1;

public class Principal {

public static void main(String[] args) {
		
		Estoque estoque1 = new Estoque("Caneta", 100, 1);
		//System.out.println("O nome do produto e: " + estoque1.getNome());
		estoque1.setNome("Caneta Azul");
		System.out.println("O nome do produto e: " + estoque1.getNome() + "\nEstoque atual: " + estoque1.getQtdAtual() + "\nEstoque minimo: " + estoque1.getQtdMinima());
		
		
		estoque1.darBaixa(50);
		System.out.println("Precisa repor o estoque? " + estoque1.precisaRepor());
		System.out.println(estoque1.mostra());
		estoque1.darBaixa(70);
		
		/*
		Estoque estoque2 = new Estoque();
		estoque2.setNome("Apagador");
		estoque2.setQtdAtual(10);
		estoque2.setQtdMinima(2);
		
		System.out.println("O nome do produto e: " + estoque2.getNome());
		System.out.println("Estoque atual: " + estoque2.getQtdAtual());
		System.out.println("Estoque minimo: " + estoque2.getQtdMinima());
		*/
		}

}