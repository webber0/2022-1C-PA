package edu.unlam.diit.pa.Metro;

public class MainMetro {

	public static void main(String[] args) {
		Archivo a=new Archivo("05_nCompleto");
		Grafo g=new Grafo(a.leerGrafo(),a.cantidadIslas);
		Kruscal kruscal=new Kruscal();
		kruscal.resolver(g);
		a.escribirResultado(g.costoMinimo);
	}
}
