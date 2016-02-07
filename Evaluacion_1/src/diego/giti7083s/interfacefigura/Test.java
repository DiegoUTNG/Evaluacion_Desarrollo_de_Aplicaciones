/**
 * 
 */
package diego.giti7083s.interfacefigura;

import java.util.Scanner;

/**
 * @author Diego
 *
 */
public class Test {

	public void testInterface() {
		Cuadrado cuadrado;
		Circulo circulo;
		Triangulo triangulo;

		Figura figura;
		int i;
		for (i = 0; i < 5; i++) {
			Scanner scaner = new Scanner(System.in);
			System.out.println("Elige una figura tecleando del 1 al 3 ");
			int seleccion = scaner.nextInt();

			switch (seleccion) {
			case 1:
				figura = new Cuadrado();
				break;

			case 2:
				figura = new Circulo();
				break;

			case 3:
				figura = new Triangulo();
				break;
			default:
				break;
			}
		}
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new Test().testInterface();

	}

}
