package edu.unlam.diit.pa.RescatandoALaPrincesa;

import java.util.PriorityQueue;

public class Dijkstra {
	public void resolver(Vertex g) {
		algoritmo(g);
	}
	
	private void algoritmo(Vertex g) {
		g.setDistance(0);
        PriorityQueue<Vertex> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(g);
        g.setVisited(true);
 
        while( !priorityQueue.isEmpty() ){
            // Getting the minimum distance vertex from priority queue
            Vertex actualVertex = priorityQueue.poll();
 
            for(Edge edge : actualVertex.getAdjacenciesList()){
 
                Vertex v = edge.getTargetVertex();
                if(!v.isVisited())
                {
                    double newDistance = actualVertex.getDistance() + edge.getWeight();
 
                    if( newDistance < v.getDistance() ){
                        priorityQueue.remove(v);
                        v.setDistance(newDistance);
                        v.setPredecessor(actualVertex);
                        priorityQueue.add(v);
                    }
                }
            }
            actualVertex.setVisited(true);
        }
    }
}
