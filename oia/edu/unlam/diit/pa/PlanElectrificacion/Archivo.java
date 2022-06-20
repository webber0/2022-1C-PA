package edu.unlam.diit.pa.PlanElectrificacion;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class Archivo {
	
	private String filename;
	protected int[] centrales;
	public Archivo(String filename) {
		this.filename = filename;
	}

	public MatrizSimetrica  leerArchivo() throws IOException {
		File archivo = new File("./oia/edu/unlam/diit/pa/PlanElectrificacion/In/" + filename + ".in");
		Scanner sc = new Scanner(archivo);
		int cantidad_nodos = sc.nextInt();
		MatrizSimetrica matriz = new MatrizSimetrica(cantidad_nodos);
		int cantidad_centrales = sc.nextInt();
		this.centrales = new int[cantidad_centrales];
		for (int z = 0; z < cantidad_centrales; z++) {
			int dato=sc.nextInt();
			if(this.centrales[z]!=dato)this.centrales[z] = dato;
			else;
			}
		for (int i = 0; i < cantidad_nodos; i++) {
			for (int j = 0; j < cantidad_nodos; j++) {
				matriz.setInfo(i, j, sc.nextInt());

			}
		}
		sc.close();
		return matriz;
	}
	
	public void escribirArchivo(int costos, ArrayList<Nodo> lista_nodos) throws IOException {
		FileWriter fl = new FileWriter("./oia/edu/unlam/diit/pa/PlanElectrificacion/Out/" + filename + ".out");
		PrintWriter pw = new PrintWriter(fl);
		pw.println(costos);
		for (int i = 0; i < lista_nodos.size(); i++) {
			if (lista_nodos.get(i).getNodo1() < lista_nodos.get(i).getNodo2()) {
				pw.println(lista_nodos.get(i).getNodo1() + " " + lista_nodos.get(i).getNodo2());
			} else {
				pw.println(lista_nodos.get(i).getNodo2() + " " + lista_nodos.get(i).getNodo1());
			}
		}
		pw.close();
	}
}

/*
Scanner scanner = null;
int[][] matriz;
int cantidadNodos,cantidadCentrales;

try {
	File file = new File("./oia/edu/unlam/diit/pa/mesadasDeGranito/In/"+this.nombre + ".in");
	scanner = new Scanner(file);
	// Especifica la configuración regional que se va a utilizar
	// scanner.useLocale(Locale.ENGLISH);
	// Para la configuración regional de Argentina, utilizar:
	// arch.useLocale(new Locale("es_AR"));

	int cant = scanner.nextInt();
	for (int i = 0; i < cant; i++) {
		ancho = scanner.nextInt();
		largo = scanner.nextInt();
		mesadas.add(new Mesada(largo,ancho));
	}
} catch (FileNotFoundException e) {
	System.out.println(e.getMessage());
} finally {
	// Cerrar el archivo, eso es mucho muy importante
	scanner.close();
}
return mesadas;
*/