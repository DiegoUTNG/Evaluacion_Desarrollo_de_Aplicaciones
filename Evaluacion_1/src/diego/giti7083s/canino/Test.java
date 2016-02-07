/**
 * 
 */
package diego.giti7083s.canino;

import java.util.Scanner;





/**
 * @author Diego
 *
 */
public class Test {

	public void TestCanino(){
		Animal animal;
		
		int i;
		for(i=0;i<2;i++){
		Scanner scanner= new Scanner(System.in);
		Perro perro = new Perro();
		perro.vacunar();
		perro.dormir();
		perro.sacarPaseo();
		
		}
		
	
	}
	
	public static void main(String[] args) {
		new Test().TestCanino();
	}

	
	}
