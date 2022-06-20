package edu.unlam.diit.pa.PlanElectrificacion;

import java.util.ArrayList;

public class Grafo {
	protected MatrizSimetrica matrizAdyacencia;
	protected int costos;
	protected ArrayList<Nodo> lista_nodos;

	public Grafo(MatrizSimetrica matrizAdyacencia) {
		this.matrizAdyacencia = matrizAdyacencia;
		this.costos = 0;
		this.lista_nodos = new ArrayList<Nodo>();
	}
}
