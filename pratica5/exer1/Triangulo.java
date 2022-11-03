package br.com.newtonpaiva.pratica5.exer1;

public class Triangulo extends PoligonoRegular {
	public Triangulo(int numLados, float tamLado) {
		super(numLados, tamLado);
		
	}

	
	@Override
	public float calcularArea() {
		return ((getTamLado() * getNumLados()) / 2);
		
	}

	
}