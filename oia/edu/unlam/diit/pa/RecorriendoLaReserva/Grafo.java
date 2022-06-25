package edu.unlam.diit.pa.RecorriendoLaReserva;

public class Grafo {
	private int cantidadMiradores,cantidadTramos;
	private Nodo[] nodos;
	public Grafo(int cantidadMiradores, int cantidadTramos, Nodo[] nodos) {
		this.cantidadMiradores = cantidadMiradores;
		this.cantidadTramos = cantidadTramos;
		this.nodos = nodos;
	}
	public int getCantidadMiradores() {
		return cantidadMiradores;
	}
	public void setCantidadMiradores(int cantidadMiradores) {
		this.cantidadMiradores = cantidadMiradores;
	}
	public int getCantidadTramos() {
		return cantidadTramos;
	}
	public void setCantidadTramos(int cantidadTramos) {
		this.cantidadTramos = cantidadTramos;
	}
	public Nodo[] getNodos() {
		return nodos;
	}
	public void setNodos(Nodo[] nodos) {
		this.nodos = nodos;
	}
	
}
