/**
 * 
 */
package paquete.com.utng.ayc;

import java.util.List;

/**
 * @author Diego
 *
 */
public class Coche {

	/**
	 * relacion co persona
	 */
	private Persona conductor;
	/**
	 * Agregacion con la clase motor
	 */
	private List<Motor> motors;

	/**
	 * constructor de la clase y agregacion de la clase motor
	 */
	public Coche(List<Motor>motors) {
		this.motors = motors;
		// TODO Auto-generated constructor stub
	}
	/**
	 * metodos de la clase
	 */
	public void asignaConductor(){
		
	}
	public void enciende(){
		
	}
	public void apaga(){
		
	}
	public void acelera(){
		
	}
	public void frena(){
		
	}
	public  boolean estaEncendido(){
		return false;
		
	}

}
