package edu.unlam.diit.pa.RescatandoALaPrincesa;

public class MainPrincesa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Archivo archivo=new Archivo("01_casoBase");
		Grafo g=archivo.leerArchivo();
		Dijkstra dijkstra=new Dijkstra();
		dijkstra.resolver(g);
	}

}
