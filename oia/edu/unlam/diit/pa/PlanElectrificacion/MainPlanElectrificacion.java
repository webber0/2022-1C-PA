package edu.unlam.diit.pa.PlanElectrificacion;

import java.io.IOException;

public class MainPlanElectrificacion {
	public static void main(String[] args) throws IOException {
		Archivo archivo=new Archivo("06_algo");
		MatrizSimetrica matriz=archivo.leerArchivo();
		Prim prim=new Prim();
		prim.resolver(matriz, archivo.centrales);
		archivo.escribirArchivo(prim.costos, prim.lista_nodos);
	}

}
