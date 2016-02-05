/**
 * 
 */
package diego.giti7083s.proyecto;

import java.util.List;

/**
 * @author Diego
 *
 */
public class Cliente {
	/**
	 * Atributos propios de la clase
	 */
	private String rfc;
	private String nombre;
	private String domicilio;
	private String telefono;
	private String email;
	
	/**
	 * relacion de 1:0 con Proyecto
	 */
	private Proyecto proyecto;
	
	/**
	 * relacion de n presupuestos
	 */
	private List<Presupuestos> solicita;

	/**
	 * constructor de la clase
	 */
	public Cliente(Presupuestos presupuestos) {
		// TODO Auto-generated constructor stub
	}

}
