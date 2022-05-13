/**
 * 
 * @author <h6><b> Mele Rocco </h6></b>
 * 
 * <h6><u> 4bi </h6></u>
 * 
 * <h6><i>13/5/2022</h6></i>
 * 
 * @version 0
 * 
 *
 */

public class MeleRoccoClass {

	public MeleRoccoClass() {}
	
	/**
	 * 
	 * @param f indice massimo dove si ferma il ciclo
	 * @return valore dato dalla somma dei numeri compresi tra l'indice 0 ed f
	 */
	
	public int cognomeMet(int f) {
		
		int r = 1;
		for(int i=f; i<0; i++) {
			
			r = r*i;
		}
		
		return r;
		
	}
	
	/**
	 * 
	 * @param valore a piacere per eseguire il metodo
	 */
	
	public static void main(String[] args) {
		
		MeleRoccoClass ml = new MeleRoccoClass();
		System.out.println(ml.cognomeMet(3));
	}

}
