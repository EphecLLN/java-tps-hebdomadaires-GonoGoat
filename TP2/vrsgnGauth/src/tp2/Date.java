/**
 * 
 */
package tp2;

//import org.w3c.dom.ls.LSOutput;

//import com.sun.org.apache.bcel.internal.generic.LNEG;

/**
 * Cette classe modélise une date de manière simplifiée.
 * @author Virginie Van den Schrieck
 *
 */
public class Date {
	
	//variables d'instance
	int jour;
	int mois;
	int annee;

public Date() {
	this.jour = 1;
	this.mois = 1;
	this.annee = 2000;
}

	
	
	/**
 * @return the jour
 */
public int getJour() {
	return jour;
}



/**
 * @param jour the jour to set
 */
public void setJour(int jour) {
	this.jour = jour;
}



/**
 * @return the mois
 */
public int getMois() {
	return mois;
}



/**
 * @param mois the mois to set
 */
public void setMois(int mois) {
	this.mois = mois;
}



/**
 * @return the annee
 */
public int getAnnee() {
	return annee;
}



/**
 * @param annee the annee to set
 */
public void setAnnee(int annee) {
	this.annee = annee;
}



	/**
	 * La méthode main permet de tester la classe date en créant un objet 
	 * au départ des arguments de la ligne de commande.  Trois arguments sont attendus, sous forme d'entiers : 
	 * Le jour, le mois et l'année.  
	 * @param args les arguments de la ligne de commande
	 */
	public static void main(String [] args) {
		Date d = new Date();
		d.jour = Integer.parseInt(args[0]);
		d.mois = Integer.parseInt(args[1]);
		d.annee = Integer.parseInt(args[2]);
		System.out.println(d.jour);
	}
}
