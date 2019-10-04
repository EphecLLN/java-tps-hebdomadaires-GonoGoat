package tp2;

/**
 * Cette classe modélise une calculatrice simplifiée avec une valeur courante et trois opérations. 
 * @author vvandens
 *
 */
public class Calculatrice {
	
	private double valeurCourante; // Stocke la valeur affichée sur l'écran de la calculatrice
	public Calculatrice() {
		this.valeurCourante = 0;
	}
	
	public Calculatrice (double value) {
		this.valeurCourante = value;
	}
	
	/**
	 * Additionne un nombre à la valeur courante
	 * @param n le nombre à ajouter à la valeur courante de la calculatrice
	 */
	void ajoute(double n) {
		valeurCourante+=n;
	}
	/**
	 * Soustrait un nombre à la valeur courante
	 * @param n le nombre à soustraire à la valeur courante de la calculatrice
	 */
	void soustrait(double n) {
		valeurCourante-=n;
	}
	/**
	 * Elève la valeur courante au carré
	 */
	void carre() {
		valeurCourante*=valeurCourante;
	}
	
	@Override
	public String toString() {
		return "La calculatrice affiche : " + getValCourante();
	}

	double getValCourante () {
		return valeurCourante;
	}
	void setValCourante(double n) {
		valeurCourante = n;
	}
	/**
	 * Méthode main permettant de lancer un test rapide de la classe calculatrice.
	 * @param args les arguments de la ligne de commande
	 */
	public static void main(String[] args) {
		Calculatrice myCalc = new Calculatrice();
		myCalc.valeurCourante = 3;
		myCalc.ajoute(5);
		myCalc.soustrait(2);
		System.out.println(myCalc.toString());
	}

}
