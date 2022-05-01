package edu.unlam.diit.pa.mesadasDeGranito;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class Archivo {
	protected String nombre;

	public Archivo(String nombre) {
		this.nombre = nombre;
	}
	
	public ArrayList<Mesada> leerArchivo() {
		Scanner scanner = null;
		ArrayList<Mesada> mesadas=new ArrayList<Mesada>();
		int largo, ancho;

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
	}
	
	public void guardarArchivo(Cantera cantera) {
		FileWriter file = null;
		PrintWriter printerWriter = null;

		try {
			file = new FileWriter("./oia/edu/unlam/diit/pa/mesadasDeGranito/Out/"+this.nombre + ".out");
			printerWriter = new PrintWriter(file);
			printerWriter.println(cantera.cantidadMinimaDePilas);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (file != null) {
				try {
					file.close();
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}
	
}
