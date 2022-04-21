package edu.unlam.diit.pa.circuloIntersecciones;

public class Circulo {
	private double radio;
	private Punto punto;

	public Circulo(Punto punto, double radio) {
		super();
		this.radio = radio;
		this.punto = punto;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public Punto getPunto() {
		return punto;
	}

	public void setPunto(Punto punto) {
		this.punto = punto;
	}

	public boolean intersectaCon(Circulo otro) {
		/*
		double dx, dy, dCentro, dCruce;
		dx = otro.getPunto().getX() - this.getPunto().getX();
		dy = otro.getPunto().getY() - this.getPunto().getY();
		dCentro = Math.hypot(dx, dy);
		dCruce = otro.getRadio() + this.getRadio();
		if (dCruce >= dCentro) {
			return true;
		}
		return false;
		*/
		//Revision 01
		return this.punto.distanciaCon(otro.punto) <= (this.radio + otro.radio);
	}

	public static void main(String[] args) {
		Circulo c1 = new Circulo(new Punto(0, 0), 1);
		Circulo c2 = new Circulo(new Punto(1, 1), 1.5);
		System.out.println(c1.intersectaCon(c2)); // true
	}
}
