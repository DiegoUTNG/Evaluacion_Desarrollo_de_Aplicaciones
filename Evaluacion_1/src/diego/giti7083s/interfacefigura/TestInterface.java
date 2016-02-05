/**
 * 
 */
package diego.giti7083s.interfacefigura;

import java.util.List;

/**
 * @author Diego
 *
 */
public class TestInterface implements Figura{
	/**
	 * Asosiacion de las clase Cuadrado
	 */
	private Cuadrado cuadrado;
	
	/**
	 * Asosiacion de las clase Circulo
	 */
	private Circulo circulo;
	
	/**
	 * Asosiacion de las clase Triangulo
	 */
	private Triangulo triangulo;
	
	/**
	 * 
	 * @param cuadrado
	 * @param circulo
	 * @param triangulo
	 */
	public TestInterface(Cuadrado cuadrado, Circulo circulo, Triangulo triangulo) {
		// TODO Auto-generated constructor stub
		this.cuadrado = new Cuadrado();
		this.circulo = new Circulo();
		this.triangulo = new Triangulo();
	}

}
