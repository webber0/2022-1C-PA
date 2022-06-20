package edu.unlam.diit.pa.PlanElectrificacion;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Prim {
	// Recursos necesarios para este ejercicio
	protected int[] centrales;
	protected int costos = 0;
	protected ArrayList<Nodo> lista_nodos = new ArrayList<Nodo>();

	public void resolver(MatrizSimetrica grafo, int[] centrales) {
		algoritmo(grafo, centrales);
	}

	private void algoritmo(MatrizSimetrica grafo, int[] centrales) {
		int grado = grafo.grado;
		boolean[] visitado = new boolean[grado];
		int fila = 0, columna = 0, fila_minima = 0, columna_minima = 0, minimo_actual = -1, minimo_anterior;
		inicializar_vector(visitado, centrales);
		if (!todosVisitados(visitado)) {
			for (fila = 0; fila < grado; fila++) {
				if (!visitado[fila]) {
					minimo_actual = -1;
					minimo_anterior = -1;
					for (columna = 0; columna < grado; columna++) {
						if (fila != columna && grafo.getInfo(fila, columna) != 0) {
							if (minimo_actual == -1)
								minimo_actual = grafo.getInfo(fila, columna);
							else
								minimo_actual = Math.min(minimo_actual, grafo.getInfo(fila, columna));

							if (minimo_actual != minimo_anterior) {
								minimo_anterior = minimo_actual;
								fila_minima = fila + 1;
								columna_minima = columna + 1;
							}
						} else
							;

					}
					if (minimo_actual != -1) {
						lista_nodos.add(new Nodo((fila_minima), (columna_minima)));
						this.costos += minimo_actual;
					}
					visitado[fila] = true;
				}
			}
		}
	}

	private void inicializar_vector(boolean[] visitado, int[] centrales) {
		for (int i = 0; i < visitado.length; i++) {
			visitado[i] = false;
		}

		for (int j = 0; j < centrales.length; j++) {
			visitado[centrales[j] - 1] = true;
		}
	}

	private boolean todosVisitados(boolean[] incluido) {
		for (boolean r : incluido) {
			if (!r)
				return r;
		}
		return true;
	}
}