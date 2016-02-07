/**
 * 
 */
package diego.giti7083s.animall;

import java.util.Scanner;



/**
 * @author Diego
 *
 */
public class Test {
	public void TestAnimall() {
		int i;
		for (i = 0; i < 10; i++) {

			Animal animal;
			
			Test test;
			Scanner scanner = new Scanner(System.in);
			System.out.println("Elige una opcion" + "\n" + "1.-Elefante"
					+ "\n 2.-Leon" + "\n 3.-Pato");
			int seleccion = scanner.nextInt();

			switch (seleccion) {
			case 1:
				animal = new Elefante();

				break;

			case 2:
				animal= new Leon();
				break;
			case 3:
				animal= new Pato();

			default:
				break;
			}

		}

	}

	/**
	 * 
	 */
	public Test() {

		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Test().TestAnimall();
		// TODO Auto-generated method stub

	}
}
