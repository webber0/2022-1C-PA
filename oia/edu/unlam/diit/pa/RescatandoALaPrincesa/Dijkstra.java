package edu.unlam.diit.pa.RescatandoALaPrincesa;

import java.util.PriorityQueue;

public class Dijkstra {
	protected int[] distancia;
	protected boolean[] visitado;
	protected int[] nodoPrevio;
	public void resolver(Grafo g) {
		algoritmo(g);
	}
	
	private void algoritmo(Grafo g) {
		distancia=new int[g.cantidadVertices];
		visitado=new boolean[g.cantidadVertices];
		nodoPrevio=new int[g.cantidadVertices];
		//Inicializo los vectores
		for(int i=0;i<g.cantidadVertices;i++) {
			distancia[i]=Integer.MAX_VALUE;
			nodoPrevio[i]=-1;
		}
		PriorityQueue<Nodo> colaActual=new PriorityQueue<Nodo>();
		distancia[g.posicionPrincesa]=0;
		colaActual.add(new Nodo(g.posicionPrincesa,0));
		int nodoActual, nodoAdyacente, peso;
		while(!colaActual.isEmpty()) {
			nodoActual=colaActual.poll().nodoOrigen;
			if(visitado[nodoActual]) {
				continue;
			}
			visitado[nodoActual]=true;
			for (Nodo nodo : g.nodosAdyacentes.get(nodoActual)) {
				nodoAdyacente=nodo.nodoOrigen;
				peso=nodo.nodoDestino;
				if(!visitado[nodoAdyacente]) {
					if(distancia[nodoActual] + peso < distancia[nodoAdyacente]) {
						distancia[nodoAdyacente]=distancia[nodoActual] + peso;
						nodoPrevio[nodoAdyacente]=nodoActual;
						colaActual.add(new Nodo(nodoAdyacente,distancia[nodoAdyacente]));
					}
				}
			}
			System.out.println("Distancia mas corta desde:");
			for(int i=0;i<g.cantidadVertices;i++) {
				System.out.printf("Vertice %d , distancia mas corta = %d\n" , i+1 , distancia[ i ] );
			}
		}
		
	}
}
