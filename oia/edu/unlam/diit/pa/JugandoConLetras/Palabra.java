package edu.unlam.diit.pa.JugandoConLetras;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Palabra {
	protected String palabra;
	protected boolean hayCoincidencia;
	protected String direccion;
	protected boolean esCompatible;

	public Palabra(String palabra) {
		this.palabra = palabra;
		this.hayCoincidencia = false;
		this.direccion = "";
		this.esCompatible = true;
	}

	private void esPalabraCompatible(String s) {
		if (palabra.length() <= s.length()) {

		} else {
			this.esCompatible = false;
		}
	}

	public void buscarCoincidencia(String s, String direccion) {
		esPalabraCompatible(s);
		if(esCompatible && !this.hayCoincidencia) {
			Pattern pattern = Pattern.compile(this.palabra, Pattern.CASE_INSENSITIVE);
		    Matcher matcher = pattern.matcher(s);
		    boolean matchFound = matcher.find();
		    if(matchFound) {
		      System.out.println("Match found: Direccion "+direccion);
		      this.hayCoincidencia=true;
		      this.direccion=direccion;
		      
		    } else {
		    }
		}
	}
}
