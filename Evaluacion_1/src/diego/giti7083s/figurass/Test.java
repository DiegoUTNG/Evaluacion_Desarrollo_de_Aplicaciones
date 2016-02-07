/**
 * 
 */
package diego.giti7083s.figurass;

import java.util.Scanner;

/**
 * @author Diego
 *
 */
public class Test {

	/**
	 * 
	 */
	public void TestFigurass() {
		int i;
		for (i = 0; i < 2; i++) {

			Figura figura;
			Scanner scanner = new Scanner(System.in);
			System.out.println("Elige una figura: " + "\n 1.-Circulo"
					+ "\n 2.-Cuadrado");
			int seleccion = scanner.nextInt();

			switch (seleccion) {
			case 1:
				figura = new Circulo();
				break;
			case 2:
				figura = new Cuadrado();

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
		new Test().TestFigurass();
	}

}
