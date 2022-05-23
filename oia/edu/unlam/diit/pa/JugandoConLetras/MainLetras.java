package edu.unlam.diit.pa.JugandoConLetras;

public class MainLetras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rapigrama rapi=null;
		Archivo archivo=new Archivo("05_noEntraTodo");
		rapi=archivo.leerArchivo();
		rapi.resolver();
		archivo.guardarArchivo(rapi);
	}

}
