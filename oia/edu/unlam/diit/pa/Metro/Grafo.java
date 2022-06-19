package edu.unlam.diit.pa.Metro;

import java.util.ArrayList;

public class Grafo {
	protected ArrayList<AristaPonderada> aristas=new ArrayList<AristaPonderada>();	
	protected int costoMinimo;
	protected int cantidadCiudades;
	public Grafo(ArrayList<AristaPonderada> aristas, int cantidadCiudades) {
		this.aristas = aristas;
		this.costoMinimo = 0;
		this.cantidadCiudades=cantidadCiudades;
	}
	
	
}
