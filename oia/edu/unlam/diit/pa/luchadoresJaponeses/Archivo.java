package edu.unlam.diit.pa.luchadoresJaponeses;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Archivo {
	protected String nombre;

	public Archivo(String nombre) {
		// super();
		this.nombre = nombre;
	}

	public Luchador[] leerArchivo() {
		Scanner scanner = null;
		Luchador[] luchadores = null;
		int peso, altura;

		try {
			File file = new File("./bin/luchadoresJaponeses/"+this.nombre + ".in");
			scanner = new Scanner(file);
			// Especifica la configuración regional que se va a utilizar
			// scanner.useLocale(Locale.ENGLISH);
			// Para la configuración regional de Argentina, utilizar:
			// arch.useLocale(new Locale("es_AR"));

			int cant = scanner.nextInt();
			luchadores = new Luchador[cant];
			for (int i = 0; i < cant; i++) {
				peso = scanner.nextInt();
				altura = scanner.nextInt();
				luchadores[i] = new Luchador(peso, altura);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Cerrar el archivo, eso es mucho muy importante
			scanner.close();
		}
		return luchadores;
	}

	public void guardarArchivo(Luchador[] resultados) {
		FileWriter file = null;
		PrintWriter printerWriter = null;

		try {
			file = new FileWriter("./bin/luchadoresJaponeses/"+this.nombre + ".out");
			printerWriter = new PrintWriter(file);

			for (int i = 0; i < resultados.length; i++) {
				// Imprime los datos y hace un salto de linea
				printerWriter.println(resultados[i].cantidadDominados);
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
