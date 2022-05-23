package edu.unlam.diit.pa.CaosDeLatas;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static ArrayList<String> letras;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tamanio=letras.size();
		int maximoAnterior=0,maximoActual=0,distanciaAnterior=0,distanciaActual=0,distancia=0,contador=0;
		for(int i=0;i<tamanio;i++) {
			while(letras.get(i).equals("G") && i<tamanio-1) {
				contador++;
				distancia++;
				i++;
			}
			if(contador>maximoActual) {
				distancia-=contador;
				maximoAnterior=maximoActual;
				maximoActual=contador;
				distanciaAnterior=distanciaActual;
				distanciaActual=distancia;
				distancia=0;
			}else {
				if(contador>maximoAnterior) {
					maximoAnterior=contador;
					//distancia-=contador;
					distanciaAnterior=distancia;
				}else {
					
				}
			}
			distancia++;
			contador=0;
		}
		System.out.println(maximoActual+" "+distanciaActual);
		System.out.println(maximoAnterior);
	}
	
	public void leer(String path) {
		//throw new RuntimeException("implementame");
		Scanner scanner = null;
		String linea="";
		try {
			File file = new File(path);
			scanner = new Scanner(file);
			// Especifica la configuración regional que se va a utilizar
			// scanner.useLocale(Locale.ENGLISH);
			// Para la configuración regional de Argentina, utilizar:
			// arch.useLocale(new Locale("es_AR"));
			letras=new ArrayList<String>();
			String letra;
			while(scanner.hasNext()) {
				
				letra=scanner.next();
				letras.add(letra);
				/*
				if(!letra.equals("F")) {
					letras.add(letra);
				}*/
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Cerrar el archivo, eso es mucho muy importante
			scanner.close();
		}
	}

}
