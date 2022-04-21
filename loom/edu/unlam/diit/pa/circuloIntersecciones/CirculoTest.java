package edu.unlam.diit.pa.circuloIntersecciones;

import static org.junit.Assert.*;

import org.junit.Test;

public class CirculoTest {

	@Test
	public void casoBase() {
		// fail("Not yet implemented");
		Circulo c1 = new Circulo(new Punto(0, 0), 1);
		Circulo c2 = new Circulo(new Punto(1, 1), 1.5);
		assertEquals(true, c1.intersectaCon(c2));
	}

	@Test
	public void casoNoIntersecta() {
		// fail("Not yet implemented");
		Circulo c1 = new Circulo(new Punto(0, 0), 1);
		Circulo c2 = new Circulo(new Punto(2, 2), 1);
		assertEquals(false, c1.intersectaCon(c2));
	}

	@Test
	public void casoIntersectaEnUnPunto() {
		// fail("Not yet implemented");
		Circulo c1 = new Circulo(new Punto(0, 0), 1);
		Circulo c2 = new Circulo(new Punto(2, 0), 1);
		assertEquals(true, c1.intersectaCon(c2));
	}

	@Test
	public void casoIntersectaEnUnPuntoElevado() {
		// fail("Not yet implemented");
		Circulo c1 = new Circulo(new Punto(0, 0), 1);
		Circulo c2 = new Circulo(new Punto(1, 1), 0.5);
		assertEquals(true, c1.intersectaCon(c2));
	}
}
