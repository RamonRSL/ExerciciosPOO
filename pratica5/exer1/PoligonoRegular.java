package br.com.newtonpaiva.pratica5.exer1;


public abstract class PoligonoRegular {
		
	protected int numLados;
	private float tamLado;
	public PoligonoRegular(int numLados, float tamLado) {
		super();
		this.numLados = numLados;
		this.tamLado = tamLado;
	}
	public int getNumLados() {
		return numLados;
	}
	public void setNumLados(int numLados) {
		this.numLados = numLados;
	}
	public float getTamLado() {
		return tamLado;
	}
	public void setTamLado(float tamLado) {
		this.tamLado = tamLado;
	}
	
	public float calcularPerimetro(float aux) {
		return numLados * tamLado;
	}
	
	public abstract float calcularArea();
}