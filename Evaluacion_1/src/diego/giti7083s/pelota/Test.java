/**
 * 
 */
package diego.giti7083s.pelota;

import java.util.Scanner;

/**
 * @author Diego
 *
 */
public class Test {

	public void TestPelota() {
		Rebotable rebotable;
		int i;
		for (i = 0; i < 3; i++) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Elige un tipo de Articulo: " + "\n 1.-Llanta"
					+ "\n 2.-Pelota de Futbol");
			int seleccion = scanner.nextInt();

			switch (seleccion) {
			case 1:
				rebotable = new Llanta();
				break;
			case 2:
				rebotable = new PelotaFutbol();
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
		new Test().TestPelota();
	}

}
