package edu.unlam.diit.pa.hotel;

public class Hostel extends Alojamiento {

	public Hostel(String nombre, int cantidadHabitaciones) {
		super(nombre, cantidadHabitaciones);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void reservarHabitacion(int habitacion, int cantMayores, int cantMenores) {
		// TODO Auto-generated method stub
		try {
			this.habitaciones[habitacion].ocuparHabitacionCon(cantMayores, cantMenores);
		} catch (HabitacionException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());;
		}
	}

	@Override
	public int contarCantidadPasajeros() {
		// TODO Auto-generated method stub
		int cantidadPasajeros=0;
		for(int i=0;i<this.habitaciones.length;i++) {
			if(!this.habitaciones[i].estaLibre) {
				cantidadPasajeros+=(this.habitaciones[i].cantidadMayores+this.habitaciones[i].cantidadMenores);
			}
		}
		return cantidadPasajeros;
	}

	@Override
	public int contarHabitacionesCon(int mayores) {
		// TODO Auto-generated method stub
		int cantidadHabitaciones=0;
		for(int i=0;i<this.habitaciones.length;i++) {
			if(!this.habitaciones[i].estaLibre && this.habitaciones[i].cantidadMayores==mayores) {
				cantidadHabitaciones++;
			}
		}
		return cantidadHabitaciones;
	}

}
