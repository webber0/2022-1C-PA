package edu.unlam.diit.pa.RecorriendoLaReserva;

public class MainReserva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Archivo archivo=new Archivo("01_casoBase");
		Grafo grafo=archivo.leerArchivo();
		DFS dfs=new DFS();
		dfs.resolver(grafo.getNodos()[0]);
		
	}

}
