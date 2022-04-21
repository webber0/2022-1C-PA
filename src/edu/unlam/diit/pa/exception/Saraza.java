package edu.unlam.diit.pa.exception;

public class Saraza {
	private int numero;

	public Saraza(int numero) {
		this.numero = numero;
	}

	public Saraza() {
		this.numero = 0;
	}

	@Override
	public String toString() {
		return "Saraza [numero=" + numero + "]";
	}
}
