/**
 * 
 */
package diego.giti7083s.proyecto;

import java.util.Scanner;



/**
 * @author Diego
 *
 */
public class Test {

	Proyecto proyecto;
	public void TestProyecto(){
		Scanner scanner = new Scanner(System.in);
		proyecto= new Proyecto(null, null);
	}
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new Test().TestProyecto();
	}
}
