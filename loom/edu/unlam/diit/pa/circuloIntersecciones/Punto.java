package edu.unlam.diit.pa.circuloIntersecciones;

import java.util.Objects;

public class Punto {
	private double x, y;

	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	/*
	public double getModulo() {
		return Math.hypot(x, y);
	}
	*/

	//Revision 01
	public double distanciaCon(Punto punto) {
		return Math.hypot(punto.x-this.x,punto.y-this.y);
		//return Math.sqrt(Math.pow((punto.x - this.x),2) + Math.pow((punto.y - this.y), 2));
	}
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Punto other = (Punto) obj;
		return Double.doubleToLongBits(x) == Double.doubleToLongBits(other.x)
				&& Double.doubleToLongBits(y) == Double.doubleToLongBits(other.y);
	}
}
