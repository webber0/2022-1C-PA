package edu.unlam.diit.pa.RescatandoALaPrincesa;

public class Nodo implements Comparable<Nodo> {
	protected int nodoOrigen, nodoDestino;

	public Nodo(int nodoOrigen, int nodoDestino) {
		this.nodoOrigen = nodoOrigen;
		this.nodoDestino = nodoDestino;
	}

	@Override
	public int compareTo(Nodo o) {
		// TODO Auto-generated method stub
		return this.nodoDestino-o.nodoDestino;
	}
	

}
