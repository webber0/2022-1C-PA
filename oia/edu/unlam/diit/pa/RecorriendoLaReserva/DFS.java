package edu.unlam.diit.pa.RecorriendoLaReserva;

import java.util.List;
import java.util.Stack;

public class DFS {
	
	public void resolver(Nodo nodo) {
		dfs(nodo);
	}
	
	private void dfs(Nodo nodo) {
		Stack<Nodo> pila=new Stack<Nodo>();
		int contador=0, iteracion=0;
		pila.add(nodo);
		while(!pila.isEmpty()) {
			Nodo elementoActual=pila.pop();
			if(!elementoActual.visitado) {
				//contador++;
				//System.out.print(elementoActual.dato+" ");
				//elementoActual.visitado=true;
				//En si, el criterio para calcular cuantos recorridos posibles hay es, cuantas veces llego al nodo final
				if(elementoActual.obtenerVecinos().isEmpty()) {
					contador++;
				}
			}
			List<Nodo> vecinos=elementoActual.obtenerVecinos();
			for(int i=0;i<vecinos.size();i++) {
				Nodo n=vecinos.get(i);
				if(n!=null && !n.visitado) {
					pila.add(n);
				}
			}
		}
		System.out.println(contador);
	}
}
