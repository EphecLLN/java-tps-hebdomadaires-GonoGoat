/**
 * 
 */
package tp8.Formes;

/**
 * @author HE201654
 *
 */
public class Carre extends Shape {
	int longueur;
	
	public Carre(int absc, int ord, int longueur) {
		super(absc, ord);
		this.longueur = longueur;
	}
	
	public double perimetre() {
		return longueur*4;
	}
	
	public double surface() {
		return Math.pow(longueur,2);
	}

	@Override
	public void agrandit(int facteur) {
		longueur *= facteur;
	}
}
