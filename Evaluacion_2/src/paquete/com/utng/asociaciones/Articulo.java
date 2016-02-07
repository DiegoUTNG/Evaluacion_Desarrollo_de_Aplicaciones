/**
 * 
 */
package paquete.com.utng.asociaciones;

import java.util.List;

/**
 * @author Diego
 *
 */
public class Articulo {
	/**
	 * atributos de la clase
	 */
	private String art_ID;
	private String art_Descripcion;
	private int art_estado;
	private int art_tipo;
	private int art_cantidad;
	private double art_cantidadcritica;
	private double art_cantidaddoble;
	
	/**
	 * Agregacion
	 */
	private List<Rubro>rubros;
	
	
	
	//private Precios precios;

	/**
	 * constructor con agregacion de Rubro y relacion con precios
	 */
	public Articulo(List<Rubro>rubros,Precios precios) {
		this.rubros = rubros;
		// TODO Auto-generated constructor stub
	}

}
