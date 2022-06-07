package edu.unlam.diit.pa.recursosGrafos.genericos;

import java.util.ArrayList;
import java.util.List;

public class Nodo {
	int dato;
	boolean visitado;
	List<Nodo> vecinos;
	
	Nodo(int dato){
		this.dato=dato;
		this.vecinos=new ArrayList<>();
	}
	
	public void agregarVecino(Nodo vecino) {
		this.vecinos.add(vecino);
	}
	
	public List<Nodo> obtenerVecinos(){
		return vecinos;
	}
}
