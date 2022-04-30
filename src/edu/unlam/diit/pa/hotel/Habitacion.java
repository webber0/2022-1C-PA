package edu.unlam.diit.pa.hotel;

public class Habitacion {
	protected int cantidadMayores, cantidadMenores;
	protected boolean esCompartida, estaLimpia, estaLibre;
	public Habitacion(boolean esCompartida) {
		this.esCompartida = esCompartida;
		this.estaLibre=true;
		this.cantidadMayores = 0;
		this.cantidadMenores = 0;
		this.esCompartida = esCompartida;
	}
	
	public void ocuparHabitacionCon(int cantidadMayores, int cantidadMenores) throws HabitacionException {
		if(cantidadMayores>0 && cantidadMenores>=0) {
			if(cantidadMayores+cantidadMenores>8) {
				throw new HabitacionException("La habitacion no puede contener mas de 8 personas en total");
			}else {
				this.cantidadMayores=cantidadMayores;
				this.cantidadMenores=cantidadMenores;
				this.estaLibre=false;
			}
		}else {
			throw new HabitacionException("Hay un numero fuera del rango permitido. Revisar\n# Adultos: "+cantidadMayores+"\n#Menores: "+cantidadMenores);
		}
	}
	
	public void limpiarHabitacion() {
		if(!this.estaLimpia) {
			this.estaLimpia=true;
		}
	}	
}
