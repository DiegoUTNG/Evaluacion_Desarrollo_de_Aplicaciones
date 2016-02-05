/**
 * 
 */
package diego.giti7083s.futbol;

/**
 * @author Diego
 *clase que implementa de IntegranteSeleccionFutbol
 */
public class SeleccionFutbol implements IntegranteSeleccionFutbol {

	/**
	 * atributos propios de la clase
	 */
	private int id;
	private String nombre;
	private String apellidos;
	private int edad;
	
	

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}



	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}



	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}



	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}



	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}



	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}



	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}



	/**
	 * 
	 */
	public SeleccionFutbol() {
		// TODO Auto-generated constructor stub
	}

}
