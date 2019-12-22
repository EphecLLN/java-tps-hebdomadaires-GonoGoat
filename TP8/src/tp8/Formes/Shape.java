/**
 * 
 */
package tp8.Formes;


/**
 * @author HE201654
 *
 */
abstract public class Shape {
	
	static private int id = 0;
	private int abscisse;
	private int ordonnee;
	
	abstract double surface();
	abstract double perimetre();
	
	public Shape(int absc, int ord) {
		this.abscisse = absc;
		this.ordonnee = ord;
		Shape.id++;
	}
	
	public String getNom() {
		return this.getClass().getSimpleName() + "-" + Shape.id;
	}
	
	public String toString() {
		return this.getNom() + "\n" + this.abscisse + "," + this.ordonnee
				+"\n" + this.perimetre() + "\n" + this.surface();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Point p = new Point(5,3);
		System.out.println(p);
		Cercle ce = new Cercle(5,3,4);
		System.out.println(ce);
		Carre ca = new Carre(5,3,4);
		System.out.println(ca);
	}

}
