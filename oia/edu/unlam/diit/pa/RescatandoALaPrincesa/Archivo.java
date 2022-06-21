package edu.unlam.diit.pa.RescatandoALaPrincesa;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Archivo {
	private String filename;

	public Archivo(String filename) {
		this.filename = filename;
	}
	
	public Grafo leerArchivo() {
		Scanner scanner = null;
		Grafo datos=null;
		int[] posicionDragones;
		int posicionPrincesa,posicionPrincipe, cantidadNodos,cantidadVertices;
		List<List<Nodo>> nodosAdyacentes=new ArrayList<List<Nodo>>();
		ArrayList<Nodo> camino=new ArrayList<Nodo>();

		try {
			File file = new File("./oia/edu/unlam/diit/pa/RescatandoALaPrincesa/In/" + filename + ".in");
			scanner = new Scanner(file);
			// Especifica la configuración regional que se va a utilizar
			scanner.useLocale(Locale.ENGLISH);
			// Para la configuración regional de Argentina, utilizar:
			// arch.useLocale(new Locale("es_AR"));
			//Lectura de datos iniciales
			cantidadNodos=scanner.nextInt();
			cantidadVertices=scanner.nextInt();
			posicionDragones=new int[scanner.nextInt()];
			posicionPrincesa=scanner.nextInt();
			posicionPrincipe=scanner.nextInt();
			//Leo todas las posiciones de los dragones 
			for(int i=0;i<posicionDragones.length;i++) {
				posicionDragones[i]=scanner.nextInt();
			}
			for(int i=0;i<cantidadVertices;i++) {
				nodosAdyacentes.add(new ArrayList<Nodo>());
			}
			while (scanner.hasNext()) {	
				//Lectura de todos los nodos con sus pesos
				int nodoOrigen, nodoDestino,peso;
				nodoOrigen=scanner.nextInt();
				nodoDestino=scanner.nextInt();
				peso=scanner.nextInt();
				nodosAdyacentes.get(nodoOrigen).add(new Nodo(nodoDestino,peso));
				//nodosAdyacentes.get(nodoDestino).add(new Nodo(nodoOrigen,peso)); //Para nodos no dirigidos
			}
			datos=new Grafo(posicionDragones, posicionPrincesa, posicionPrincipe, cantidadNodos, cantidadVertices, nodosAdyacentes);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Cerrar el archivo, eso es mucho muy importante
			scanner.close();
		}
		return datos;
		//return null;
	}
	
	public void escribirArchivo() {
		
	}
}
