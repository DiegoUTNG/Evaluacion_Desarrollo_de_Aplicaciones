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
public class Viaje {
	/**
	 * atributos de la clase
	 */
	private int limite;
	private boolean transporte;
	private String motivo;
	private Date fechaIda;
	private Date fechaVuelta;
	private String Estado;
	
	/**
	 * relacion * con Comercial
	 */
	private List<Comercial>realiza;
	
	/**
	 * relacion 1 con Presupuestos
	 */
	private Presupuestos se_realiza_en;
	
	/**
	 * relacion 1 con Gasto
	 */
	private Gasto gasto;
	
	

	/**
	 * constructor de la clase
	 */
	public Viaje(Comercial comercial, Presupuestos presupuestos, Gasto gasto) {
		// TODO Auto-generated constructor stub
	}

}
