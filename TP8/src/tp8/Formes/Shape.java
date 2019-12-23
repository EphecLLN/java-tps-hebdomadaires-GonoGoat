/**
 * 
 */
package tp8.Formes;


import tp8.Affichable;
import tp8.Transformable;

/**
 * @author HE201654
 *
 */
abstract public class Shape implements Affichable, Transformable {
	
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
	public void affiche() {
		System.out.println(this);
	}

	public void deplace(int deltaX, int deltaY) {
		abscisse += deltaX;
		ordonnee += deltaY;
	}

	@Override
	public abstract void agrandit(int facteur);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Point p = new Point(5,3);
		p.affiche();
		p.deplace(2,3);
		p.affiche();
		Cercle ce = new Cercle(5,3,4);
		ce.affiche();
		ce.agrandit(2);
		ce.affiche();
		Carre ca = new Carre(5,3,4);
		ca.affiche();
		ca.agrandit(2);
		ca.affiche();
	}

}
