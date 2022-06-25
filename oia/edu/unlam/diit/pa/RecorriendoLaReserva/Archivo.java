package edu.unlam.diit.pa.RecorriendoLaReserva;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Archivo {
	private String filename;

	public Archivo(String filename) {
		this.filename = filename;
	}
	
	public Grafo leerArchivo() {
		Scanner scanner=null;
		int cantidadMiradores,cantidadTramos;
		Nodo[] nodos;
		Grafo dato=null;
		try {
			File file = new File("./oia/edu/unlam/diit/pa/RecorriendoLaReserva/In/"+filename+".in");
			scanner=new Scanner(file);
			cantidadMiradores=scanner.nextInt();
			cantidadTramos=scanner.nextInt();
			nodos=new Nodo[cantidadMiradores];
			for(int i=0;i<cantidadMiradores;i++) {
				nodos[i]=new Nodo(i+1);
			}
			while(scanner.hasNext()) {
				int nodoOrigen=scanner.nextInt();
				int nodoDestino=scanner.nextInt();
				nodos[nodoOrigen-1].agregarVecino(nodos[nodoDestino-1]);
			}
			dato=new Grafo(cantidadMiradores,cantidadTramos,nodos);
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}finally {
			scanner.close();
		}
		return dato;
	}

}
