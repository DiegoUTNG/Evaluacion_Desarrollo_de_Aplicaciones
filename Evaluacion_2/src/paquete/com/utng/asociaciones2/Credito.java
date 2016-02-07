/**
 * 
 */
package paquete.com.utng.asociaciones2;

/**
 * @author Diego
 *
 */
public class Credito extends Pago{
	/**
	 * Atributos de la clase
	 */
	private int numeroTdeCredito;
	private String tipo;
	/**
	 * Atributo de tipo fechaDeExp
	 */
	private fechaDeExp fechaDeExp;
	/**
	 * Atributo de la clase
	 */
	private String nombre;
	
	/**
	 *
	 * @param total
	 * @return
	 */
	public static boolean hacerCargo(double total){
		return false;
	}
	

	/**
	 * 
	 */
	public Credito() {
		// TODO Auto-generated constructor stub
	}

}
