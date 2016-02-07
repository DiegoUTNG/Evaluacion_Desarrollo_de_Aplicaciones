/**
 * 
 */
package diego.giti7083s.mascotas;

import java.util.Scanner;

/**
 * @author Diego
 *
 */
public class Test {

	public void TestMascota() {
		Animal animal;
		Scanner scanner = new Scanner(System.in);
		int i;
		for (i = 0; i < 5; i++) {
			System.out.println("Que mascota quieres comprar" + "\n 1.-Gato"
					+ "\n 2.-Leon" + "\n 3.-Perro");
			int selector = scanner.nextInt();

			switch (selector) {
			case 1:
				animal = new Gato();
				break;
			case 2:
				animal = new Leon();
				
				
				break;

			case 3:
				animal = new Perro();
				break;

			default:
				break;
			}
		}
	}

	public static void main(String[] args) {
		new Test().TestMascota();
	}

}
