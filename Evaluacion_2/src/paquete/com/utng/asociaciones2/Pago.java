/**
 * 
 */
package paquete.com.utng.asociaciones2;

/**
 * @author Diego
 *
 */
public class Pago {
	/**
	 * Atributos de la clase
	 */
	private double subTotal;
	private double propina;
	private double impuestos;
	/**
	 * relacion con orden
	 */
	private Orden orden;
	
	/**
	 * 
	 * @param subTotal
	 * @param propina
	 * @param impuestos
	 * @return
	 */
	public static double calculoTotal(double subTotal, double propina, double impuestos){
		
		return 0;
		
	}

	/**
	 * constructor
	 */
	public Pago() {
		// TODO Auto-generated constructor stub
	}

}
