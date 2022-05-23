package edu.unlam.diit.pa.JugandoConLetras;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Archivo {
	protected String nombre;

	public Archivo(String nombre) {
		// super();
		this.nombre = nombre;
	}

	public Rapigrama leerArchivo() {
		Scanner scanner = null;
		// Luchador[] luchadores = null;
		char[][] matriz = null;
		Rapigrama rapi = null;
		ArrayList<Palabra> palabras = new ArrayList<Palabra>();
		int dimension, cantidadPalabras;

		try {
			File file = new File("./oia/edu/unlam/diit/pa/JugandoConLetras/In/" + this.nombre + ".in");
			scanner = new Scanner(file);
			// Especifica la configuración regional que se va a utilizar
			// scanner.useLocale(Locale.ENGLISH);
			// Para la configuración regional de Argentina, utilizar:
			// arch.useLocale(new Locale("es_AR"));
			dimension = scanner.nextInt();
			cantidadPalabras = scanner.nextInt();
			matriz = new char[dimension][dimension];

			for (int i = 0; i < dimension; i++) {
				String line = scanner.next();
				for (int j = 0; j < dimension; j++) {
					matriz[i][j] = line.charAt(j);
				}
			}
			for (int i = 0; i < cantidadPalabras; i++) {
				String line = scanner.next();
				palabras.add(new Palabra(line));
			}
			rapi = new Rapigrama(matriz, palabras);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Cerrar el archivo, eso es mucho muy importante
			scanner.close();
		}
		return rapi;
	}

	public void guardarArchivo(Rapigrama resultados) {
		FileWriter file = null;
		PrintWriter printerWriter = null;

		try {
			file = new FileWriter("./oia/edu/unlam/diit/pa/JugandoConLetras/Out/" + this.nombre + ".out");
			printerWriter = new PrintWriter(file);
			if (!resultados.msjError.equals("")) {
				printerWriter.println(resultados.msjError);
			} else {
				if (!resultados.hayAlMenosUnaCoincidencia && resultados.msjError.equals("")) {
					printerWriter.println("No fue posible determinar una coincidencia");
				} else {
					for (int i = 0; i < resultados.palabras.size(); i++) {
						if (resultados.palabras.get(i).hayCoincidencia) {
							printerWriter.println((i + 1) + " " + resultados.palabras.get(i).direccion);
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (file != null) {
				try {
					file.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
