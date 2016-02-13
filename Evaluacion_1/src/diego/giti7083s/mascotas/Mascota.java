/**
 * 
 */
package diego.giti7083s.mascotas;

/**
 * @author Diego clase que implementa de Animal
 */
public class Mascota implements Animal {
	/**
	 * atributo propio de la clase Mascota
	 */
	private String nombre;

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void lamer() {

	}

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		
	}
}
