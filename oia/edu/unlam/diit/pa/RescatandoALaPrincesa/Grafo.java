package edu.unlam.diit.pa.RescatandoALaPrincesa;
import java.util.*;
public class Grafo {
	protected int[] posicionDragones;
	protected int posicionPrincesa,posicionPrincipe, cantidadNodos,cantidadVertices;
	protected List<List<Nodo>> nodosAdyacentes=new ArrayList<List<Nodo>>();
	protected ArrayList<Nodo> camino=new ArrayList<Nodo>();
	public Grafo(int[] posicionDragones, int posicionPrincesa, int posicionPrincipe, int cantidadNodos,
			int cantidadVertices, List<List<Nodo>> nodosAdyacentes) {
		this.posicionDragones = posicionDragones;
		this.posicionPrincesa = posicionPrincesa;
		this.posicionPrincipe = posicionPrincipe;
		this.cantidadNodos = cantidadNodos;
		this.cantidadVertices = cantidadVertices;
		this.nodosAdyacentes = nodosAdyacentes;
		//this.camino = camino;
	}
	
	
}
