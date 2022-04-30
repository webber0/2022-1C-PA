package edu.unlam.diit.pa.starface;

public class ModoNormal extends ModoTanque {

	@Override
	public void atacar() {
		System.out.println("10 de danio");

	}

	@Override
	public void moverse() {
		System.out.println("Se mueve");

	}

	@Override
	public ModoTanque cambiarModo() {
		return new ModoAsedio();

	}

}
