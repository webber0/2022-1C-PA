package edu.unlam.diit.pa.RescatandoALaPrincesa;

import java.util.List;

public class Vertex {
	private int id;
	private List<Edge> adjacenciesList;
	private boolean visited;
	private Vertex predecessor;
	private double distance=Double.MAX_VALUE;
	public Vertex(int id, List<Edge> adjacenciesList) {
		this.id = id;
		this.adjacenciesList = adjacenciesList;
	}
	
}
