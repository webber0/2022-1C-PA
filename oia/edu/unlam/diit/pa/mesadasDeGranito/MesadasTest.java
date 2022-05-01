package edu.unlam.diit.pa.mesadasDeGranito;

import static org.junit.Assert.*;

import org.junit.Test;

public class MesadasTest {
	/*
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	*/
	@Test
	public void casoBase() {
		Archivo archivo=new Archivo("01_casoBase");
		Cantera cantera=new Cantera(archivo.leerArchivo());
		cantera.calcularCantidadPilas();
		archivo.guardarArchivo(cantera);
		assertEquals(3, cantera.cantidadMinimaDePilas);
	}
	
	@Test
	public void algunaMesadaEsCero() {
		Archivo archivo=new Archivo("02_AlgunaMesadaEs0");
		Cantera cantera=new Cantera(archivo.leerArchivo());
		cantera.calcularCantidadPilas();
		archivo.guardarArchivo(cantera);
		assertEquals(2, cantera.cantidadMinimaDePilas);
	}
	
	@Test
	public void algunaMedidaEsCero() {
		Archivo archivo=new Archivo("03_AlgunaMedidaEs0");
		Cantera cantera=new Cantera(archivo.leerArchivo());
		cantera.calcularCantidadPilas();
		archivo.guardarArchivo(cantera);
		assertEquals(2, cantera.cantidadMinimaDePilas);
	}
	
	@Test
	public void todosSonCero() {
		Archivo archivo=new Archivo("04_TodasSon0");
		Cantera cantera=new Cantera(archivo.leerArchivo());
		cantera.calcularCantidadPilas();
		archivo.guardarArchivo(cantera);
		assertEquals(0, cantera.cantidadMinimaDePilas);
	}
	
	@Test
	public void soloUnaMesada() {
		Archivo archivo=new Archivo("05_SoloTengoUnaMesada");
		Cantera cantera=new Cantera(archivo.leerArchivo());
		cantera.calcularCantidadPilas();
		archivo.guardarArchivo(cantera);
		assertEquals(1, cantera.cantidadMinimaDePilas);
	}
	
	@Test
	public void soloUnaMesadaConCero() {
		Archivo archivo=new Archivo("06_SoloUnaMesada0");
		Cantera cantera=new Cantera(archivo.leerArchivo());
		cantera.calcularCantidadPilas();
		archivo.guardarArchivo(cantera);
		assertEquals(0, cantera.cantidadMinimaDePilas);
	}
	
}
