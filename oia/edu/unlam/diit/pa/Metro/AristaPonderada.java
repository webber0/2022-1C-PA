package edu.unlam.diit.pa.Metro;

public class AristaPonderada extends Arista implements Comparable<AristaPonderada> {
	private int costo;

	public AristaPonderada(int origen, int destino, int costo) {
		super(origen, destino);
		this.costo = costo;
	}

	public int getCosto() {
		return costo;
	}

	public void setCosto(int costo) {
		this.costo = costo;
	}

	@Override
	public int compareTo(AristaPonderada o) {
		// TODO Auto-generated method stub
		return Integer.compare(this.costo, o.costo);
	}

}
