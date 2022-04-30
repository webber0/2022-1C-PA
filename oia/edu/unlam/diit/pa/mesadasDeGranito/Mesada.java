package edu.unlam.diit.pa.mesadasDeGranito;

import java.util.Objects;

public class Mesada implements Comparable<Mesada> {
	protected int largo, ancho;

	public Mesada(int largo, int ancho) {
		this.largo = Integer.max(largo, ancho);
		this.ancho = Integer.min(largo, ancho);
	}

	@Override
	public int hashCode() {
		return Objects.hash(ancho, largo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mesada other = (Mesada) obj;
		return ancho == other.ancho && largo == other.largo;
	}

	@Override
	public String toString() {
		return "[" + largo + ", " + ancho + "]";
	}

	@Override
	public int compareTo(Mesada o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
