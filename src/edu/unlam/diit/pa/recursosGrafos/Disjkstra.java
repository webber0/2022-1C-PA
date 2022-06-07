package edu.unlam.diit.pa.recursosGrafos;

import java.util.PriorityQueue;

public class Disjkstra {
	public static void calcularCamino(Claro origen) {
		origen.distanciaMinima=0;
		PriorityQueue<Claro> caminoDelBosque = new PriorityQueue<Claro>();
		caminoDelBosque.add(origen);
		
		while(!caminoDelBosque.isEmpty()) {
			Claro paso = caminoDelBosque.poll();
			for (Camino ca : paso.adyacencia) {
				Claro posicion = ca.objetivo;
				double peso = ca.peso;
				double distanciaATravesDePaso = paso.distanciaMinima+peso;
				if(distanciaATravesDePaso < posicion.distanciaMinima) {
					caminoDelBosque.remove(posicion);
					posicion.distanciaMinima =distanciaATravesDePaso;
					posicion.anterior = paso;
					caminoDelBosque.add(posicion);
				}
			}
		}
	}
}
