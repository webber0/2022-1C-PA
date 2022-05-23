package edu.unlam.diit.pa.JugandoConLetras;

import java.util.ArrayList;

public class Rapigrama {
	protected char[][] tablero;
	protected ArrayList<Palabra> palabras;
	protected boolean hayAlMenosUnaCoincidencia;
	protected String msjError;
	public Rapigrama(char[][] tablero, ArrayList<Palabra> palabras) {
		this.tablero = tablero;
		this.palabras = palabras;
		this.hayAlMenosUnaCoincidencia = false;
		this.msjError="";
	}
	
	private boolean esCompatible() {
		boolean esCompatible=false;
		for(int i=0;i<palabras.size();i++) {
			if(palabras.get(i).palabra.length()<=tablero.length) {
				esCompatible=true;
				break;
			}
		}
		return esCompatible;
	}
	
	
	private void resolverNorte() {		
		for(int j=0;j<tablero.length;j++) {
			String lineaActual="";
			for(int i=0;i<tablero.length;i++) {
				lineaActual+=tablero[i][j];
			}
			StringBuilder strb = new StringBuilder(lineaActual);
			lineaActual = strb.reverse().toString();
			for (Palabra palabra : palabras) {
				palabra.buscarCoincidencia(lineaActual, Direccion.N.toString());
			}
		}
	}
	
	private void resolverSur() {		
		for(int j=0;j<tablero.length;j++) {
			String lineaActual="";
			for(int i=0;i<tablero.length;i++) {
				lineaActual+=tablero[i][j];
			}
			//StringBuilder strb = new StringBuilder(lineaActual);
			//lineaActual = strb.reverse().toString();
			for (Palabra palabra : palabras) {
				palabra.buscarCoincidencia(lineaActual, Direccion.S.toString());
			}
		}
	}
	
	private void resolverEste() {		
		for(int i=0;i<tablero.length;i++) {
			String lineaActual="";
			for(int j=0;j<tablero.length;j++) {
				lineaActual+=tablero[i][j];
			}
			for (Palabra palabra : palabras) {
				palabra.buscarCoincidencia(lineaActual, Direccion.E.toString());
			}
		}
	}
	
	private void resolverOeste() {		
		for(int i=0;i<tablero.length;i++) {
			String lineaActual="";
			for(int j=0;j<tablero.length;j++) {
				lineaActual+=tablero[i][j];
			}
			StringBuilder strb = new StringBuilder(lineaActual);
			lineaActual = strb.reverse().toString();
			for (Palabra palabra : palabras) {
				palabra.buscarCoincidencia(lineaActual, Direccion.O.toString());
			}
		}
	}
	private void verificarCoincidencia() {
		for (Palabra palabra : palabras) {
			if(palabra.hayCoincidencia) {
				this.hayAlMenosUnaCoincidencia=true;
				break;
			}
		}
	}
	public void resolver() {
		//Primero verifico que sea compatible la matriz 
		if(!esCompatible()) {
			this.msjError="No es posible buscar estas palabras en la matriz dada";
		}
		
		if(msjError.equals("")) {
			System.out.println("Ejecucion normal");
			resolverNorte();
			resolverEste();
			resolverSur();
			resolverOeste();
			verificarCoincidencia(); //Para saber que escribo
		}else {
			System.out.println(this.msjError);
		}
	}
}
