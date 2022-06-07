package edu.unlam.diit.pa.recursosGrafos;

public class Claro implements Comparable<Claro> {
	public final String nombre;
	public Camino[] adyacencia;
	public double distanciaMinima = Double.POSITIVE_INFINITY;
	public Claro anterior;
	public Claro(String nombre) {
		this.nombre=nombre;
	}
	@Override
	public int compareTo(Claro o) {
		// TODO Auto-generated method stub
		return Double.compare(this.distanciaMinima, o.distanciaMinima);
	}
	
	@Override
	public String toString() {
		return nombre;
	}

}
