package edu.unlam.diit.pa.mesadasDeGranito;

import java.util.ArrayList;
import java.util.Collections;

public class Cantera {
	protected ArrayList<Mesada> mesadas;
	protected int cantidadMinimaDePilas;

	public Cantera(ArrayList<Mesada> mesadas) {
		this.mesadas = mesadas;
		this.cantidadMinimaDePilas=0;
	}
	private boolean tieneAreaCero(Mesada mesada) {
		if(mesada.ancho * mesada.largo == 0) {
			return true;
		}
		return false;
	}
	public void calcularCantidadPilas() {
		if(mesadas.size()==1) {			
			if(mesadas.get(0).largo * mesadas.get(0).ancho == 0 ) {
				this.cantidadMinimaDePilas=0; //Caso 6
			}else {
				this.cantidadMinimaDePilas=1; //Caso 5
			}
		}else {
			//Si tengo mas de un elemento, entonces tengo que chequear que ningun elemento sea cero
			boolean todosLosElementosSonCero=true;
			for (Mesada mesada : mesadas) {
				if(tieneAreaCero(mesada)) {
					
				}else {
					todosLosElementosSonCero=false;
					break;
				}
			}
			if(!todosLosElementosSonCero) {
				//Dado que hay mas de un elemento valido entonces lo ordeno, y minimamente 
				//necesito una pila
				this.cantidadMinimaDePilas++;
				Collections.sort(mesadas);
				for(int i=0;i<mesadas.size()-1;i++) {
					if(mesadas.get(i).ancho<mesadas.get(i+1).ancho && !tieneAreaCero(mesadas.get(i)) && !tieneAreaCero(mesadas.get(i+1)) ) {
						cantidadMinimaDePilas++;
					}
				}
			}
		}
	}
}
