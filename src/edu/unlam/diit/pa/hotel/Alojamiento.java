package edu.unlam.diit.pa.hotel;

import java.util.Objects;

public abstract class Alojamiento {
	protected String nombre;
	protected HabitacionHotel[] habitaciones;
	private int cantidadHabitaciones;
	public Alojamiento(String nombre, int cantidadHabitaciones) {
		this.nombre = nombre;
		this.habitaciones=new HabitacionHotel[cantidadHabitaciones];
		this.cantidadHabitaciones=cantidadHabitaciones;
	}
	public abstract void reservarHabitacion(int habitacion, int cantMayores, int cantMenores);
	public abstract int contarCantidadPasajeros();
	public abstract int contarHabitacionesCon(int mayores);
	//Definir la igualdad entre hoteles en funcion de la cantidad de habitaciones
	@Override
	public int hashCode() {
		return Objects.hash(cantidadHabitaciones);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alojamiento other = (Alojamiento) obj;
		return cantidadHabitaciones == other.cantidadHabitaciones;
	}
	
	
}