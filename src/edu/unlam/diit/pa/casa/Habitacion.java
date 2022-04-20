package edu.unlam.diit.pa.casa;

public class Habitacion {
	protected String nombreHabitacion;
	private Bombita[] bombitas; //Cambiarlo a ArrayList
	
	public Habitacion(String nombreHabitacion, Bombita[] bombitas) {
		this.nombreHabitacion = nombreHabitacion;
		this.bombitas = bombitas;
	}
		
	public Bombita buscarBombillaDeMayorConsumo() {
		Bombita bombitaMayorConsumo=bombitas[0];
		for(int i=1;i<bombitas.length;i++) {
			bombitaMayorConsumo=bombitas[i].obtenerBombitaDeMayorConsumo(bombitaMayorConsumo);
		}
		return bombitaMayorConsumo;
	}

}
