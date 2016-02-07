/**
 * 
 */
package diego.giti7083s.animal;

import java.util.Scanner;





/**
 * @author Diego
 *
 */
public class Test {
	
	public void TestAnimal(){
		int i;
		for(i=0;i<10;i++){
			
		
			LAnimal ianimal;
			Test test;
			Scanner scanner = new Scanner(System.in);
			System.out.println("Elige una opcion"+"\n"+"1.-Gato"+"\n 2.-Perro");
			int seleccion = scanner.nextInt();
			
			
			switch (seleccion) {
			case 1:
				ianimal = new Gato();
				break;
				
			case 2: 
				ianimal= new Perro();
			
				
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
		new Test().TestAnimal();
		// TODO Auto-generated method stub

	}

}
