/**
 * 
 */
package tp6;

/**
 * @author HE201654
 *
 */
public class Employe extends Personne {
	private int salaire;
	private String employeur;
	
	Employe(String nom, String prenom, int num, String employeur,int salaire) {
		super(nom,prenom,num);
		this.salaire = salaire;
		this.employeur = employeur;
	}
	/**
	 * @return the salaire
	 */
	public int getSalaire() {
		return salaire;
	}
	/**
	 * @param salaire the salaire to set
	 */
	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}
	/**
	 * @return the employeur
	 */
	public String getEmployeur() {
		return employeur;
	}
	/**
	 * @param employeur the employeur to set
	 */
	public void setEmployeur(String employeur) {
		this.employeur = employeur;
	}
	public String toString () {
		return super.toString() + " " + this.salaire + " " + this.employeur; 
	}
	
	
}
