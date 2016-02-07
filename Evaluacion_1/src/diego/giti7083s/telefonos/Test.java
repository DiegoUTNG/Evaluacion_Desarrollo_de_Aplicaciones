/**
 * 
 */
package diego.giti7083s.telefonos;

import java.util.Scanner;

/**
 * @author Diego
 *
 */
public class Test {

	public void TestTelefonos() {
		Telefono telefono;
		VideoPlayer videoPlayer;
		int i;
		for (i = 0; i < 4; i++) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Elige una manera de comunicarte tecleando del 1 al 3"
					);
			int seleccion = scanner.nextInt();

			switch (seleccion) {
			case 1:
				telefono = new TelefonoFijo();
				break;
			case 2:
				telefono = new TelefonoMovil();
				break;
			case 3:
				videoPlayer = new VideoTelefono();
				break;

			default:
				break;
			}
		}
	}

	public static void main(String[] args) {
		new Test().TestTelefonos();
	}

}
