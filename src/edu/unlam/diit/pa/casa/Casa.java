package edu.unlam.diit.pa.casa;

public class Casa {
	protected String nombreCasa;
	private Habitacion[] habitaciones; // Cambiarlo a ArrayList

	public Casa(String nombreCasa, Habitacion[] habitaciones) {
		this.nombreCasa = nombreCasa;
		this.habitaciones = habitaciones;
	}

	public Bombita buscarBombillaDeMayorConsumoGeneral() {
		Bombita bombitaMayorConsumoGeneral = habitaciones[0].buscarBombillaDeMayorConsumo(); // Obtengo la primera para
																								// comparar contra algo
		for (int i = 1; i < habitaciones.length; i++) {
			bombitaMayorConsumoGeneral = bombitaMayorConsumoGeneral
					.obtenerBombitaDeMayorConsumo(habitaciones[i].buscarBombillaDeMayorConsumo());
		}
		return bombitaMayorConsumoGeneral;
	}

}
