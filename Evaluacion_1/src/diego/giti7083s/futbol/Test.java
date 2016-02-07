/**
 * 
 */
package diego.giti7083s.futbol;

import java.util.Scanner;



/**
 * @author Diego
 *
 */
public class Test {

	public void testFutbol(){
		IntegranteSeleccionFutbol integranteSeleccionFutbol;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Integrantes de la seleccion de Futbol Española: ");
		integranteSeleccionFutbol= new Entrenador();
		integranteSeleccionFutbol= new Futbolista();
		integranteSeleccionFutbol= new Masajista();
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new Test().testFutbol();
	}

}
