/**
 * 
 */
package paquete.com.utng.asociaciones;

import java.util.List;

/**
 * @author Diego
 *
 */
public class Proveedor {
	/**
	 * Atributos de la clase
	 */
	private double pr_ID;
	private String pr_RazonSocial;
	private String pr_contacto;
	private String pr_telefono1;
	private short pr_telefono2;
	private String pr_fax;
	private String pr_email1;
	private String pr_email2;
	private String pr_web;
	private int pr_CUIT;
	
	/**
	 * Agregacion
	 */
	private List<Rubro>rubros;
	/**
	 * Agregacion
	 */
	private List<Direccion> direccions;

	
	/**
	 * constructor de la clase y agregacion con las clases rubro y direccion, relación con calificación y articulo
	 */
	public Proveedor(List<Rubro>rubros,List<Direccion> direccions,Caificacion caificacion, Articulo articulo) {
		this.rubros = rubros;
		this.direccions = direccions;
		// TODO Auto-generated constructor stub
	}

}
