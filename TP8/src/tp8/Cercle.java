/**
 * 
 */
package tp8;

/**
 * @author HE201654
 *
 */
public class Cercle extends Shape {
	int rayon;
	
	public Cercle(int absc, int ord, int rayon) {
		super(absc, ord);
		this.rayon = rayon;
	}
	
	public double perimetre() {
		return this.rayon*2* Math.PI;
	}
	
	public double surface() {
		return Math.pow(this.rayon,2) * Math.PI;
	}
}
