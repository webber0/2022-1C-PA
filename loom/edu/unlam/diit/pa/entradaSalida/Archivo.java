package edu.unlam.diit.pa.entradaSalida;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;


public class Archivo {
	private String nombre;
	private int max,min,promedio;
	public Archivo(String nombre) {
		this.nombre=nombre;
		this.max=0;
		this.min=0;
		this.promedio=0;
	}
	/*
	 * Este metodo genera un archivo con una cantidad al azar
	 * de entre 20.000 y 10.000 numeros que pueden ser
	 * entre 12.000 y 0; tambien al azar
	 */
	public void generarArchivo() {
		FileWriter file=null;
		PrintWriter printerWriter=null;
		Random generadorRandom=new Random();
		int cantidadRandom=(int) (Math.random()*(20000-10000)) + 10000;
		int valorRandom;
		try {
			file=new FileWriter(this.nombre);
			printerWriter=new PrintWriter(file);
			for(int i=0;i<cantidadRandom;i++) {
				valorRandom=generadorRandom.nextInt(12000+0)+0;
				printerWriter.println(valorRandom);
			}
		}catch(Exception e) {
				e.printStackTrace();
			}finally {
				if(file!=null) {
					try {
						file.close();
					}catch(Exception e){
						e.printStackTrace();
					}
				}
			}
		}
	/*
	 * Este metodo graba con el formato especifico que requiere el enunciado
	 */
	public void generarArchivo(int max,int min,int promedio) {
		FileWriter file=null;
		PrintWriter printerWriter=null;
		String txtdelimitador="+----------+-------+";
		String txtmaximo="| Maximo   "+String.format("| %5d |", this.max);
		String txtminimo="| Minimo   "+String.format("| %5d |", this.min);
		String txtpromedio="| Promedio "+String.format("| %5d |", this.promedio);
		try {
			file=new FileWriter("salida.out");
			printerWriter=new PrintWriter(file);
			printerWriter.println(txtdelimitador); //Primer delimitador
			printerWriter.println(txtmaximo);
			printerWriter.println(txtdelimitador); //Segundo delimitador
			printerWriter.println(txtminimo);
			printerWriter.println(txtdelimitador); //Tercer delimitador
			printerWriter.println(txtpromedio);
			printerWriter.println(txtdelimitador); //Cuarto delimitador
			
		}catch(Exception e) {
				e.printStackTrace();
			}finally {
				if(file!=null) {
					try {
						file.close();
					}catch(Exception e){
						e.printStackTrace();
					}
				}
			}
		}
	/*
	 * generarReporte es un metodo que calcula el maximo, el minimo y
	 * el promedio de un archivo que contiene una indeterminada cantidad de
	 * valores y luego lo manda a grabar directamente 
	 */
	public void generarReporte() {
		int suma=0,cantidadDeValores=0, valorActual=-1;
		boolean esPrimeraEjecucion=true;
		Scanner scanner =null;
		try {
			File file=new File(this.nombre);
			scanner = new Scanner(file);
			scanner.useLocale(Locale.ENGLISH);
			while(scanner.hasNext()) {
				valorActual=scanner.nextInt();
				if(esPrimeraEjecucion) {
					this.max=valorActual;
					this.min=valorActual;
					esPrimeraEjecucion=false;
				}else {
					this.max=Integer.max(this.max, valorActual);
					this.min=Integer.min(this.min, valorActual);
				}
				suma+=valorActual;
				cantidadDeValores++;
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			scanner.close();
		}
		this.promedio=(int) suma/cantidadDeValores;
		/*
		 * El calculo del promedio asi simple puede tener un error de
		 * +-1, por como redondea Java -comparado con Excel-. 
		 */
		generarArchivo(this.max,this.min, this.promedio);
	}
	
	public static void main(String[] args) {
		Archivo file = new Archivo("Lote.in");
		file.generarArchivo();
		file.generarReporte();
	}

}
