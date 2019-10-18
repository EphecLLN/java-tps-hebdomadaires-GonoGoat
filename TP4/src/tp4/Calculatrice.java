package tp4;

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
	double carre() {
		valeurCourante*=valeurCourante;
		return valeurCourante;
	}
	
	@Override
	/**
	 * @return un messageen console indiquant la valeur courante
	 */
	public String toString() {
		return "La calculatrice affiche : " + getValCourante();
	}
	/**
	 * 
	 * @return la valeur courante
	 */
	double getValCourante () {
		return valeurCourante;
	}
	/**
	 * 
	 * @param n la nouvelle valeur courante � mettre
	 */
	void setValCourante(double n) {
		valeurCourante = n;
	}
	/**
	 * 
	 * @param obj une autre calculatrice
	 * @return un bool�an indiquant l'�galit� entre les valeurs courante de chaque objet
	 */
	public boolean equals(Calculatrice obj) {
		return this.getValCourante() == obj.getValCourante();
	}
	/**
	 * Méthode main permettant de lancer un test rapide de la classe calculatrice.
	 * @param args les arguments de la ligne de commande
	 */
	public static void main(String [] args) {
		Calculatrice myCalc = new Calculatrice(Double.parseDouble(args[0]));
		Calculatrice myCalcu = new Calculatrice(Double.parseDouble(args[1]));
		myCalc.ajoute(5);
		myCalc.soustrait(2);
		myCalcu.ajoute(5);
		myCalcu.soustrait(2);
		if (myCalc.equals(myCalcu)) { System.out.println("Les calculatrice sont �gales");}
	}

}
