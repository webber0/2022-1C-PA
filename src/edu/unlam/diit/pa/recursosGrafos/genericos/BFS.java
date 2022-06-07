package edu.unlam.diit.pa.recursosGrafos.genericos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
	private Queue<Nodo> cola;
	static ArrayList<Nodo> nodos=new ArrayList<Nodo>();
	public BFS(){
		cola = new LinkedList<Nodo>();
	}
	
	public void bfs(Nodo nodo) {
		cola.add(nodo);
		nodo.visitado=true;
		while(!cola.isEmpty()) {
			Nodo elemento=cola.remove();
			System.out.println(elemento.dato+" ");
			List<Nodo> vecinos = elemento.obtenerVecinos();
			for(int i=0;i<vecinos.size();i++) {
				Nodo n=vecinos.get(i);
				if(n!=null && !n.visitado) {
					cola.add(n);
					n.visitado=true;
				}
			}
		}
	}
}
