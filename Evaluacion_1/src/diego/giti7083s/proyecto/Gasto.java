/**
 * 
 */
package diego.giti7083s.proyecto;

import java.util.Date;
import java.util.List;

/**
 * @author Diego
 *
 */
public class Gasto {
	/**
	 * Atributos propios de la clase Gasto
	 */
	private String lugar;
	private Date fecha;
	private String lnt;
	private String tipo;
	private String justificante;
	private Double precio;
	
	/**
	 * relacion * con Viaje
	 */
	private List<Viaje> pertenece;

	/**
	 * constructor de la clase
	 */
	public Gasto(Viaje viaje) {
		// TODO Auto-generated constructor stub
	}

}
