/**
 * 
 */
package tp6;

/**
 * @author HE201654
 *
 */
public class Independant extends Personne {

	private String numTVA;
	
	Independant(String nom, String prenom, int num,String numTVA) {
		super(nom,prenom,num);
		this.numTVA = numTVA;
	}

	/**
	 * @return the numTVA
	 */
	public String getNumTVA() {
		return numTVA;
	}

	/**
	 * @param numTVA the numTVA to set
	 */
	public void setNumTVA(String numTVA) {
		this.numTVA = numTVA;
	}
	
	public String toString () {
		return super.toString() + " " + this.numTVA; 
	}
	
}
