package edu.unlam.diit.pa.RecorriendoLaReserva;

import java.util.ArrayList;
import java.util.List;

public class Nodo {
	protected int dato;
	protected boolean visitado;
	protected List<Nodo> vecinos;
	public Nodo(int dato) {
		this.dato = dato;
		this.visitado = false;
		this.vecinos = new ArrayList<Nodo>();
	}
	
	public void agregarVecino(Nodo nodo) {
		this.vecinos.add(nodo);
	}
	
	public List<Nodo> obtenerVecinos(){
		return this.vecinos;
	}
	
	
}
