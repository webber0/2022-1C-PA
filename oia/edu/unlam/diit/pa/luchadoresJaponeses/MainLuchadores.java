package edu.unlam.diit.pa.luchadoresJaponeses;

public class MainLuchadores {
	public static void main(String[] args) {
		Archivo archivo = new Archivo("01_casoBase");
		Torneo cuadrilatero = new Torneo(archivo.leerArchivo());
		cuadrilatero.compararLuchadores();
		archivo.guardarArchivo(cuadrilatero.luchadores);
	}

}
