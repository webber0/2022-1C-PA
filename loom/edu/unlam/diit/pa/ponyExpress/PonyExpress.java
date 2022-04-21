package edu.unlam.diit.pa.ponyExpress;

public class PonyExpress {
	/**
	 * 
	 * @param estaciones es la distancia en millas de una estación hasta la otra
	 * 
	 * @returns la cantidad de jinetes necesarios para enviar el correo desde un
	 * 
	 *          extremo hasta el otro del recorrido
	 * 
	 */
	public int jinetes(int[] estaciones) {
		/*
		 * int cantidadDeEstaciones = 0; double suma = 0, parteEntera, parteDecimal; for
		 * (int i = 0; i < estaciones.length; i++) { suma += estaciones[i]; } suma /=
		 * 100; parteDecimal = suma % 1; parteEntera = suma - parteDecimal; if
		 * (parteEntera > 0.0) { cantidadDeEstaciones = (int) parteEntera; } if
		 * (parteDecimal > 0.0) { cantidadDeEstaciones++; } if (parteDecimal >= 0.5) {
		 * cantidadDeEstaciones++; } return cantidadDeEstaciones;
		 */
		// Primera Revisión
		/*
		 * int millasAcumuladas = 0, cantJinetes = 1;
		 * 
		 * for (int i = 0; i < estaciones.length - 1; i++) { millasAcumuladas +=
		 * estaciones[i]; if(millasAcumuladas + estaciones[i+1] > 100) { cantJinetes++;
		 * millasAcumuladas = 0; } } return cantJinetes;
		 */
		// Segunda Revision
		int cant = 1, // se entiende que siempre se necesita un jinete para enviar un correo
				distancia = 0;

		for (int i : estaciones) {
			distancia += i;
			if (distancia > 100) { // si un jinete supera las 100 millas
				cant++; // cambio a uno nuevo,
				distancia = i; // el cual viajará la distancia que el jinete anterior no pudo
			}
		}
		return cant;
	}
}
