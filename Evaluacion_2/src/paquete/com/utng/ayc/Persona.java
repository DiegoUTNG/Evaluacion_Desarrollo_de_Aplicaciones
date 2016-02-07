/**
 * 
 */
package paquete.com.utng.ayc;

import java.util.ArrayList;
import java.util.List;



/**
 * @author Diego
 *
 */
public class Persona {
	/**
	 * Atributo de la clase
	 */
	public String nombre;
	/**
	 * relacion con coche
	 */
	private Coche coche;
	
	/**
	 * composicion con corazon
	 */
	private List<Corazon> corazons;
	
	/**
	 * construcor de la clase y composicion con la clase corazon
	 */
	public Persona(String nom) {
		this.corazons = new ArrayList<Corazon>(); {
		};
		// TODO Auto-generated constructor stub
	}
	
	public void asignaCoche(Coche c){
		
		
	}
	

}
