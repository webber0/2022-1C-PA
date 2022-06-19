package edu.unlam.diit.pa.Metro;

import java.util.ArrayList;

public class Kruscal {
	private int[] padres;
	ArrayList<Arista> recorrido = new ArrayList<Arista>();

	public void resolver(Grafo g) {
		algoritmo(g);
	}

	public void algoritmo(Grafo g) {
		this.padres = new int[g.cantidadCiudades + 1];
		for (int i = 0; i < this.padres.length; i++) {
			this.padres[i] = i;
		}

		int origen, destino, peso, numAristas;
		for (int i = 0; i < g.aristas.size() - 1; i++) {
			origen = g.aristas.get(i).getOrigen();
			destino = g.aristas.get(i).getDestino();
			peso = g.aristas.get(i).getCosto();
			if (!sameComponent(origen, destino)) {
				g.costoMinimo += peso;
				union(origen, destino);
			}
		}
	}

	private void union(int nodo1, int nodo2) {
		this.padres[find(nodo1)] = this.padres[find(nodo2)];
	}

	private int find(int nodo) {
		return this.padres[nodo] == nodo ? nodo : find(this.padres[nodo]);
	}

	private boolean sameComponent(int x, int y) {
		if (find(x) == find(y))
			return true;
		return false;
	}
}
