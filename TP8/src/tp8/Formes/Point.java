/**
 * 
 */
package tp8.Formes;

/**
 * @author HE201654
 *
 */
public class Point extends Shape {
	
	public Point(int absc, int ord) {
		super(absc, ord);
	}
	
	public double perimetre() {
		return 0;
	}
	
	public double surface() {
		return 0;
	}

	@Override
	public void agrandit(int facteur) { }
}
