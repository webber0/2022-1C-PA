package edu.unlam.diit.pa.RescatandoALaPrincesa;

import java.util.List;

public class Vertex implements Comparable<Vertex> {
	//private int id;
	private List<Edge> adjacenciesList;
	private boolean visited;
	private Vertex predecessor;
	private double distance = Double.MAX_VALUE;

	public Vertex(/*int id,*/ List<Edge> adjacenciesList) {
		//this.id = id;
		this.adjacenciesList = adjacenciesList;
	}

	public void addNeighbour(Edge adj) {
		this.adjacenciesList.add(adj);
	}

	public List<Edge> getAdjacenciesList() {
		return adjacenciesList;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public Vertex getPredecessor() {
		return predecessor;
	}

	public void setPredecessor(Vertex predecessor) {
		this.predecessor = predecessor;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	@Override
	public int compareTo(Vertex otherVertex) {
		return Double.compare(this.distance, otherVertex.getDistance());
	}
}
