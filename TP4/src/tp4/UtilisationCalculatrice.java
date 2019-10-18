/**
 * 
 */
package tp4;

/**
 * @author HE201654
 *
 */
public class UtilisationCalculatrice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Calculatrice myCalc = new Calculatrice();
		myCalc.setValCourante(Double.parseDouble(args[0]));
		System.out.println(myCalc.getValCourante());
	}

}
