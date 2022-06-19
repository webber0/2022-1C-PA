package edu.unlam.diit.pa.Metro;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class Archivo {
	private String nombreArchivo;
	protected static int cantidadIslas;

	public Archivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
		cantidadIslas=0;
	}
	
	public ArrayList<AristaPonderada> leerGrafo() {
		Scanner scanner = null;
		ArrayList<AristaPonderada> datos = new ArrayList<AristaPonderada>();
		int cantidadPuentes=0,cantidadTuneles=0;

		try {
			File file = new File("./oia/edu/unlam/diit/pa/Metro/In/" + nombreArchivo + ".in");
			scanner = new Scanner(file);
			// Especifica la configuración regional que se va a utilizar
			scanner.useLocale(Locale.ENGLISH);
			// Para la configuración regional de Argentina, utilizar:
			// arch.useLocale(new Locale("es_AR"));
			cantidadIslas=scanner.nextInt();
			cantidadTuneles=scanner.nextInt();
			cantidadPuentes=scanner.nextInt();
			if(cantidadPuentes==0 && cantidadTuneles==0) {
				throw new MetroException("No es posible realizar ninguna obra");
			}
					
			while(scanner.hasNext()) {
				//Pongo en 0 los tuneles
				for(int i=0;i<cantidadTuneles;i++) {
					int nodoDesde=scanner.nextInt();
					int nodoHasta=scanner.nextInt();
					datos.add(new AristaPonderada(nodoDesde,nodoHasta,0));
				}
				//Pongo en 1 los puentes
				for(int i=0;i<cantidadPuentes;i++) {
					int nodoDesde=scanner.nextInt();
					int nodoHasta=scanner.nextInt();
					datos.add(new AristaPonderada(nodoDesde,nodoHasta,1));
				}
			}
			Collections.sort(datos);
		} catch(MetroException e) {
			escribirResultado(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Cerrar el archivo, eso es mucho muy importante
			scanner.close();
		}
		return datos;
	}
	
	public void escribirResultado(int costoMinimo) {
		FileWriter file = null;
		PrintWriter printerWriter = null;

		try {
			file = new FileWriter("./oia/edu/unlam/diit/pa/Metro/Out/"+ nombreArchivo + ".out");
			printerWriter = new PrintWriter(file);
			printerWriter.println(costoMinimo);
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
	
	public void escribirResultado(String msj) {
		FileWriter file = null;
		PrintWriter printerWriter = null;

		try {
			file = new FileWriter("./oia/edu/unlam/diit/pa/Metro/Out/"+ nombreArchivo + ".out");
			printerWriter = new PrintWriter(file);
			printerWriter.println(msj);
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
