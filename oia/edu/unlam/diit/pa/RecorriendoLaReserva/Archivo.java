package edu.unlam.diit.pa.RecorriendoLaReserva;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
	
	public void escribirArchivo(int resultado) {
		FileWriter file=null;
		PrintWriter printwriter=null;
		try {
			file=new FileWriter("./oia/edu/unlam/diit/pa/RecorriendoLaReserva/Out/"+filename+".out");
			printwriter=new PrintWriter(file);
			printwriter.println(resultado);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			if(file!=null) {
				try {
					file.close();
				}catch(IOException e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}

}
