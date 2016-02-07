/**
 * 
 */
package paquete.com.utng.asociaciones2;

import java.util.List;

/**
 * @author Diego
 *
 */
public class Orden {
	/**
	 * Atributos de la clase
	 */
	private int hora;
	private String mesero;
	/**
	 * relacion con cliente
	 */
	private Cliente cliente;
	
	private List<Bebida> bebidas;
	private List<Platillo>platillos;
	
	/**
	 * Relacion con pago
	 */
	private Pago pago;

	/**
	 * constructor de la clase y agregacion de las clase bebida y platillo
	 */
	public Orden(List<Bebida> bebidas, List<Platillo>platillos) {
		this.bebidas = bebidas;
		this.platillos = platillos;
		// TODO Auto-generated constructor stub
	}

}
