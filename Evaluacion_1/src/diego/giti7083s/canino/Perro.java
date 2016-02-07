/**
 * 
 */
package diego.giti7083s.canino;

/**
 * @author Diego
 * clase que hereda de Canino
 */
public class Perro extends Canino{
	public Perro() {
		System.out.println("Soy un perro mascota de Diego y");
		// TODO Auto-generated constructor stub
	}
		
	/**
	 * comportamientos que hereda
	 */
		@Override
		public Package comer() {
			// TODO Auto-generated method stub
			return super.comer();
		}
		
		@Override
		public Package hacerRuido() {
		// TODO Auto-generated method stub
		return super.hacerRuido();
		}
		
		/**
		 * comportamientos propios de la clase Perro
		 */
		public void sacarPaseo(){
			System.out.println("Por las tardes me saca de paseo mi dueño");
			
		}
		
		public void vacunar(){
			System.out.println("Semestralmente me lleva al veterinario a que me vacunen");
			
		}

}
