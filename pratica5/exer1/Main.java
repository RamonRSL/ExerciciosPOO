package br.com.newtonpaiva.pratica5.exer1;

public class Main {

	public static void main(String[] args) {
		
		Quadrado qd = new Quadrado(4,2);
		Triangulo tg = new Triangulo(2,4);
		
		System.out.println(qd.calcularArea());
		System.out.println(tg.calcularArea());
	}

}