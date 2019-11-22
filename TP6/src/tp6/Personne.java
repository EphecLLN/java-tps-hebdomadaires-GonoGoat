/**
 * 
 */
package tp6;

/**
 * @author HE201654
 *
 */
public class Personne {
	
	private String nom;
	private String prenom;
	private int numRegistre;
	
	public Personne() {
		this.nom = "";
		this.prenom = "";
		this.numRegistre = 1;
	}
	public Personne(String nom, String prenom, int num) {
		this.nom = nom;
		this.prenom = prenom;
		this.numRegistre = num;
	}
	/**
	 * 
	 * @param p l'objet personne que l'on compare
	 * @return un booléen en fonction de l'égalité entre les 
	 * 2 numéros de registre national 
	 */
	public boolean equals (Personne p) {
		return this.numRegistre == p.numRegistre;
	}
	
	/**
	 * 
	 * @param p la personne en cours
	 * @return une phrase contenant chaque information d'une personne
	 */
	public String toString () {
		return this.nom + " " + this.prenom + " " + this.numRegistre; 
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the numRegistre
	 */
	public int getNumRegistre() {
		return numRegistre;
	}

	/**
	 * @param numRegistre the numRegistre, different de 0, to set
	 */
	public void setNumRegistre(int numRegistre) {
		if (numRegistre == 0) {
			System.out.println("Mauvais numéro de registre national");
		}
		else {
			this.numRegistre = numRegistre;
		}
	}
	public static void main (String[] args){
		Personne pers = new Personne("Jules", "Dupont", 123234);
		Personne emp = new Employe("Jules", "Dupont", 123234, "EPHEC", 1500);
		Personne ind = new Independant("Jules", "Dupont", 123234, "BE0123456789");
		System.out.println(pers);
		System.out.println(emp);
		System.out.println(ind);
	}
	
}
