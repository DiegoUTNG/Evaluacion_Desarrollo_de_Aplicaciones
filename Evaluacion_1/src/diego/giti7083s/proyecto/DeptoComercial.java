/**
 * 
 */
package diego.giti7083s.proyecto;

import java.util.List;



/**
 * @author Diego
 *
 */
public class DeptoComercial {
	/**
	 * atributo propio de DeptoComercial
	 */
	private String responsable;
	
	/**
	 * relacion con coemrcial
	 */
	private Comercial pertenece;
	
	/**
	 * relacion con presupuestos
	 */
	private Presupuestos presupuestos;
	
	/**
	 * comportaminetos propios de la clase
	 */
	
	public static void asignarViaje(){
		
	}
	public static void asignarLimite(){
		
	}
	public static void validarPresupuesto(){
		
	}
	
	

	/**
	 * @return the responsable
	 */
	public String getResponsable() {
		return responsable;
	}
	/**
	 * @param responsable the responsable to set
	 */
	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}
	/**
	 * constructor de la clase
	 */
	public DeptoComercial(Comercial comercials, Presupuestos presupuestos) {

		// TODO Auto-generated constructor stub
	}

}
