/**
 * 
 */
package diego.giti7083s.factory;

import java.util.Scanner;

/**
 * @author Diego
 *
 */
public class Test {
	/**
	 * 
	 */

	public void TestFactory() {
		int i;
		for (i = 0; i < 2; i++) {

			ProductoA productoA;
			ProductoB productoB;
			Scanner scanner = new Scanner(System.in);
			System.out.println("Selecciona Un Producto: " + "\n 1.-ProductoA"
					+ "\n 2.-ProductoB");
			int seleccion = scanner.nextInt();

			switch (seleccion) {
			case 1:
				Scanner scanner2 = new Scanner(System.in);
				System.out.println("Selecciona el producto: "
						+ "\n 1.-ProductoA1" + "\n 2.-ProductoA2");
				int seleccion2 = scanner2.nextInt();
				switch (seleccion2) {

				case 1:
					productoA = new ProductoA1();
					Cliente cliente = new Cliente();
					break;

				case 2:
					productoA = new ProductoA2();
					Cliente cliente2 = new Cliente();

				default:
					break;
				}
				break;
			case 2:
				Scanner scanner3 = new Scanner(System.in);
				System.out.println("Selecciona el producto: "
						+ "\n 1.-ProductoB1" + "\n 2.-ProductoB2");
				int seleccion3 = scanner3.nextInt();
				switch (seleccion3) {
				case 1:
					productoB = new ProductoB1();
					Cliente cliente3 = new Cliente();
					break;
				case 2:
					productoB = new ProductoB2();
					Cliente cliente4 = new Cliente();
					break;

				default:
					break;
				}

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
		new Test().TestFactory();
	}

}
