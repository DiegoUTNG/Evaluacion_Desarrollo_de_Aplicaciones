/**
 * 
 */
package paquete.com.utng.asociaciones2;

import java.util.List;

/**
 * @author Diego
 *
 */
public class Cliente {
	/**
	 * Atributos de la clase
	 */
	private int mesa;
	private int comensales;
	
	/**
	 * Relacion * --> Orden
	 */
	private List<Orden> ordens;

	/**
	 * constructor y relacion *
	 */
	public Cliente(List<Orden> ordens) {
		// TODO Auto-generated constructor stub
	}

}
