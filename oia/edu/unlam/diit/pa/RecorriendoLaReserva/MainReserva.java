package edu.unlam.diit.pa.RecorriendoLaReserva;

public class MainReserva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Archivo archivo=new Archivo("01_casoBase");
		Grafo grafo=archivo.leerArchivo();
		DFS dfs=new DFS();
		grafo.setResultado(dfs.resolver(grafo.getNodos()[0]));
		System.out.println(grafo.getResultado());
		archivo.escribirArchivo(grafo.getResultado());
	}

}
