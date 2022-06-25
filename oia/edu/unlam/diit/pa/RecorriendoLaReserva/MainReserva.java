package edu.unlam.diit.pa.RecorriendoLaReserva;

public class MainReserva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Nodo[] array=new Nodo[10];
		for(int i=0;i<array.length;i++) {
			array[i]=new Nodo(i+1);
		}
		
		array[0].agregarVecino(array[1]);
		array[0].agregarVecino(array[8]);
		
		array[1].agregarVecino(array[6]);
		array[1].agregarVecino(array[2]);
		
		array[2].agregarVecino(array[3]);
		
		array[3].agregarVecino(array[4]);
		array[3].agregarVecino(array[5]);
		
		array[4].agregarVecino(array[7]);
		array[4].agregarVecino(array[9]);
		
		array[5].agregarVecino(array[7]);
		array[5].agregarVecino(array[4]);
		
		array[6].agregarVecino(array[5]);
		
		array[7].agregarVecino(array[9]);
		
		array[8].agregarVecino(array[2]);
		array[8].agregarVecino(array[9]);
		*/
		Archivo archivo=new Archivo("01_casoBase");
		Grafo grafo=archivo.leerArchivo();
		DFS dfs=new DFS();
		dfs.resolver(grafo.getNodos()[0]);
		
	}

}
