package edu.unlam.diit.pa.punto;

public class MainPunto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto punto1 = new Punto(3, 5.5);
		Punto punto2 = new Punto(3, 5.5);
		Punto punto3; // Este va a ser el punto resultado de una suma
		punto3 = punto1.suma(punto2);
		System.out.println(punto1);
		System.out.println(punto2);
		System.out.println(punto3);
		// punto1.desplazar(1, 2);
		System.out.println(punto1);
		if (punto1 == punto2) {
			System.out.println("Son iguales");
		} else {
			System.out.println("Son distintos");
		}
		if (punto1.equals(punto2)) {
			System.out.println("Son iguales");
		} else {
			System.out.println("Son distintos");
		}
	}
}
