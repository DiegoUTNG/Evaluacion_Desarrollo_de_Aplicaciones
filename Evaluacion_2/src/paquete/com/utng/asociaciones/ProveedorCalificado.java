/**
 * 
 */
package paquete.com.utng.asociaciones;

import java.util.Date;
import java.util.List;

/**
 * @author Diego
 *
 */
public class ProveedorCalificado {
	/**
	 * Atributos de la clase
	 */
	private Date FechaCalificacion;
	private int cal_ID;
	private int pr_ID;
	
	/**
	 * Agregacion
	 */
	private List<Caificacion> caificacions;
	
	private Caificacion caificacion;

	/**
	 * constructor de la clase con agregacion y relacion de la clase calificacion
	 */
	public ProveedorCalificado(List<Caificacion> caificacions,Caificacion caificacion) {
		this.caificacions = caificacions;
		// TODO Auto-generated constructor stub
	}

}
