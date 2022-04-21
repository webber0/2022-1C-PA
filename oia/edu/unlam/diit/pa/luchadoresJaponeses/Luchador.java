package edu.unlam.diit.pa.luchadoresJaponeses;

public class Luchador {
	protected int peso, altura;
	protected int cantidadDominados;

	public Luchador(int peso, int altura) {
		// super();
		this.peso = peso;
		this.altura = altura;
		this.cantidadDominados = 0;
	}

	public boolean dominaA(Luchador l) {
		if ((this.altura > l.altura && this.peso > l.peso) || (this.altura == l.altura && this.peso > l.peso)
				|| (this.altura > l.altura && this.peso == l.peso)) {
			return true;
		} else {
			return false;
		}
	}
}
