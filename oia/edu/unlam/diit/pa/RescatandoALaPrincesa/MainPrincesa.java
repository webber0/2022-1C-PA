package edu.unlam.diit.pa.RescatandoALaPrincesa;

public class MainPrincesa {
	public static void main(String[] args) {
		Vertex vertex1 = new Vertex("1");
		Vertex vertex2 = new Vertex("2");
		Vertex vertex3 = new Vertex("3");
		Vertex vertex4 = new Vertex("4");
		Vertex vertex5 = new Vertex("5");
		Vertex vertex6 = new Vertex("6");
		Vertex vertex7 = new Vertex("7");
		Vertex vertex8 = new Vertex("8");
		Vertex vertex9 = new Vertex("9");
		Vertex vertex10 = new Vertex("10");
		
		vertex1.addNeighbour(new Edge (3,vertex1,vertex2));
		vertex1.addNeighbour(new Edge (3,vertex2,vertex1));
		vertex1.addNeighbour(new Edge (2,vertex1,vertex3));
		vertex1.addNeighbour(new Edge (2,vertex3,vertex1));
		vertex2.addNeighbour(new Edge(1,vertex2,vertex6));
		vertex2.addNeighbour(new Edge(1,vertex6,vertex2));
		vertex3.addNeighbour(new Edge(2,vertex3,vertex6));
		vertex3.addNeighbour(new Edge(2,vertex6,vertex3));
		vertex3.addNeighbour(new Edge(2,vertex3,vertex4));
		vertex3.addNeighbour(new Edge(2,vertex4,vertex3));
		vertex3.addNeighbour(new Edge(1,vertex3,vertex8));
		vertex3.addNeighbour(new Edge(1,vertex8,vertex3));
		vertex4.addNeighbour(new Edge(2,vertex4,vertex5));
		vertex4.addNeighbour(new Edge(2,vertex5,vertex4));
		vertex6.addNeighbour(new Edge(3,vertex6,vertex9));
		vertex6.addNeighbour(new Edge(3,vertex9,vertex6));
		vertex8.addNeighbour(new Edge(5,vertex8,vertex6));
		vertex8.addNeighbour(new Edge(5,vertex6,vertex8));
		Archivo archivo=new Archivo("01_casoBase");
		archivo.leerArchivo();
		Dijkstra dijkstra=new Dijkstra();
		dijkstra.computeShortestPaths(vertex9);
		System.out.println(dijkstra.getShortestPathTo(vertex1));
	}
}
