package edu.unlam.diit.pa.PlanElectrificacion;

import java.io.File;
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

	public MatrizSimetrica leerArchivo() throws IOException {
		File archivo = new File("./oia/edu/unlam/diit/pa/PlanElectrificacion/In/" + filename + ".in");
		Scanner sc = new Scanner(archivo);
		int cantidad_nodos = sc.nextInt();
		MatrizSimetrica matriz = new MatrizSimetrica(cantidad_nodos);
		int cantidad_centrales = sc.nextInt();
		this.centrales = new int[cantidad_centrales];
		for (int z = 0; z < cantidad_centrales; z++) {
			int dato = sc.nextInt();
			if (this.centrales[z] != dato)
				this.centrales[z] = dato;
			else
				;
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