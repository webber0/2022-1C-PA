package edu.unlam.diit.pa.hotel;

public class HabitacionHotel extends Habitacion{
	protected boolean esEstandar;
	
	public HabitacionHotel(boolean esCompartida) {
		super(esCompartida);
		this.esEstandar=true;
		
	}
}
