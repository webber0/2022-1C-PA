package edu.unlam.diit.pa.casa;

import java.util.Objects;

public class Bombita {
	private int wattsConsumidos;

	public Bombita(int wattsConsumidos) {
		this.wattsConsumidos = wattsConsumidos;
	}

	@Override
	public String toString() {
		return "Watts Consumidos: " + wattsConsumidos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(wattsConsumidos);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bombita other = (Bombita) obj;
		return wattsConsumidos == other.wattsConsumidos;
	}

	public Bombita obtenerBombitaDeMayorConsumo(Bombita otra) {
		if (this.wattsConsumidos > otra.wattsConsumidos) {
			return this;
		} else {
			return otra;
		}
	}
}
