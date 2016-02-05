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
public class Presupuestos {
	/**
	 * relacion * con DeptoComercial
	 */

	private List<DeptoComercial> valida;
	/**
	 * relacion 1 con Cliente
	 */
	private Cliente cliente;
	
	/**
	 * atributos propios de la clase
	 */
	private Date fecha;
	private String descipcion;
	private Double importe;
	private String estado;
	
	/**
	 * relacion 1 con Comercial
	 */
	private Comercial calcula;
	/**
	 * Relacion * con Viaje
	 */
	private List<Viaje> tiene;
	
	/**
	 * Relacion * con Proyecto
	 */
	private List<Proyecto> proyectos;

	/**
	 * constructor de la clase
	 */
	public Presupuestos(IConsutarEstado consutarEstado, Cliente cliente,
			Viaje viaje, Proyecto proyecto) {
		// TODO Auto-generated constructor stub
	}

}
