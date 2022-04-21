package edu.unlam.diit.pa.hotel;

import java.util.Objects;

public class Hotel {
	private int cantidadDeHabitaciones;
	private int[] cantidadDeMayores;
	private int[] cantidadDeMenores;
	private int siguienteHabitacionAAsignar;
	//A
	public Hotel(int Habitaciones) {
		this.cantidadDeHabitaciones=Habitaciones;
		cantidadDeMayores=new int[this.cantidadDeHabitaciones];
		cantidadDeMenores=new int[this.cantidadDeHabitaciones];
		siguienteHabitacionAAsignar=0;
	}
	//B (El cambio es: que devuelve si pudo o no, sino el usuario tiene que verificar las cosas
	public boolean ocuparHabitacionCon(int mayores, int menores) {
		//Si cumple con alguna de estas condiciones, entonces directamente ya no puedo asignar más habitaciones
		if(siguienteHabitacionAAsignar>cantidadDeHabitaciones-1 || mayores+menores>8 || mayores+menores<=0) {
			return false;
		}else {
			cantidadDeMayores[siguienteHabitacionAAsignar]=mayores;
			cantidadDeMenores[siguienteHabitacionAAsignar]=menores;
			siguienteHabitacionAAsignar++;
			return true;
		}
	}
	//C
	public int obtenerCantidadTotalHuespedes() {
		int suma=0;
		for(int i=0;i<cantidadDeMayores.length;i++) {
			suma+=cantidadDeMayores[i];
		}
		for(int i=0;i<cantidadDeMenores.length;i++) {
			suma+=cantidadDeMenores[i];
		}
		return suma;
	}
	//D
	public int contarHabitacionesCon(int mayores) {
		int cantidadHabitacionesConMayores=0;
		for(int i=0;i<cantidadDeMayores.length;i++) {
			if(cantidadDeMayores[i]==mayores) {
				cantidadHabitacionesConMayores++;
			}else {
				
			}
		}
		return cantidadHabitacionesConMayores;
	}
	
	//D
	@Override
	public int hashCode() {
		return Objects.hash(cantidadDeHabitaciones);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hotel other = (Hotel) obj;
		return cantidadDeHabitaciones == other.cantidadDeHabitaciones;
	}
}
