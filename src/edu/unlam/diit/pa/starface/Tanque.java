package edu.unlam.diit.pa.starface;
/*
 * Demostracion del Patron de diseño "State"
 * */
public class Tanque {
	//private String modo;
	private ModoTanque modo=new ModoNormal();
	public void cambiarModo() {
		this.modo.cambiarModo();
	}
	
	public void moverse() {
		this.modo.moverse();
	}
	
	public void atacar() {
		/*
		if(this.modo.enemigoEnRango(enemigo)) {
			this.modo.atacar(enemigo);
		}
		*/
	}
	/*
	public void modoNormal() {
		this.modo="normal";
	}
	*/
	/*
	public void modoAsedio() {
		this.modo="asedio";
	}
	*/
	/*
	public void moverse() {
		this.modo=.modo.cambiarModo();
	}
	*/

}
