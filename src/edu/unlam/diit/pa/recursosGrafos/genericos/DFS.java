package edu.unlam.diit.pa.recursosGrafos.genericos;

import java.util.List;
import java.util.Stack;

public class DFS {
	public void dfs(Nodo nodo) {
		Stack<Nodo> pila=new Stack<Nodo>();
		pila.add(nodo);
		while(!pila.isEmpty()) {
			Nodo elemento=pila.pop();
			if(!elemento.visitado) {
				System.out.println(elemento.dato+" ");
				elemento.visitado=true;
			}
			
			List<Nodo> vecinos = elemento.obtenerVecinos();
			for(int i=0; i<vecinos.size();i++) {
				Nodo n=vecinos.get(i);
				if(n!=null && !n.visitado) {
					pila.add(n);
				}
			}
		}
	}
}
