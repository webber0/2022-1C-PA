package edu.unlam.diit.pa.luchadoresJaponeses;

public class Torneo {
	protected Luchador[] luchadores;

	public Torneo(Luchador[] luchadores) {
		// super();
		this.luchadores = luchadores;
	}

	public void compararLuchadores() {
		for (int i = 0; i < luchadores.length; i++) {
			for (int j = 0; j < luchadores.length; j++) {
				if (i != j) {
					if (luchadores[i].dominaA(luchadores[j])) {
						luchadores[i].cantidadDominados++;
					}
				}
			}
		}
	}
}
