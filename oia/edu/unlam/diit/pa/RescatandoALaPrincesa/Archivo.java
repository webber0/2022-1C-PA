package edu.unlam.diit.pa.RescatandoALaPrincesa;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Archivo {
	private String filename;
	
	public Archivo(String filename) {
		this.filename = filename;
	}

	public void leerArchivo() {
		Scanner scanner=null;
		int cantidadNodos, nodoOrigen, nodoDestino;
		double costo;
		ArrayList<Vertex> vertices;
		try {
			File file=new File("./oia/edu/unlam/diit/pa/RescatandoALaPrincesa/In/"+filename+".in");
			scanner=new Scanner(file);
			cantidadNodos=scanner.nextInt();
			vertices=new ArrayList<Vertex>();
			for(int i=1;i<=cantidadNodos;i++) {
				vertices.add(new Vertex(Integer.toString(i)));
			}
			while(scanner.hasNext()) {
				nodoOrigen=scanner.nextInt();
				nodoDestino=scanner.nextInt();
				costo=scanner.nextDouble();
				vertices.get(nodoOrigen-1).addNeighbour(new Edge(costo, vertices.get(nodoOrigen-1),vertices.get(nodoDestino-1)));
			}
			//System.out.println("Saraza");
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}finally {
			scanner.close();
		}
	}
}
