package br.com.newtonpaiva.pratica5.exer1;

public class Quadrado extends PoligonoRegular {

	public Quadrado(int numLados, float tamLado) {
		super(numLados, tamLado);
	}

	@Override
	public float calcularArea() {
		
		return getNumLados()*getTamLado() ;
	}

}