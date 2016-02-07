/**
 * 
 */
package paquete.com.utng.ayc;

import java.util.List;

/**
 * @author Diego
 *
 */
public class Aplicacion {
	
	
	/**
	 * metodos de la clase
	 */
	public void inicia(){
		
	}
	public void main(){
		
	}
	

	/**
	 * constructor y dependencia de las clases motor, coche y persona
	 */
	public Aplicacion() {
		// TODO Auto-generated constructor stub
		Motor motor = new Motor();
		Coche coche = new Coche(null);
		Persona persona = new Persona(null);
	}

}
