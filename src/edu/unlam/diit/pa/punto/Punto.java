package edu.unlam.diit.pa.punto;

import java.util.Objects;

public class Punto {
	private double x, y;

	public Punto() {
		this(0, 0);
	}

	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Punto suma(Punto o) {
		return new Punto(this.x + o.x, this.y + o.y);
	}

	public void desplazar(double dx, double dy) {
		this.x += dx;
		this.y += dy;
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

	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}
}