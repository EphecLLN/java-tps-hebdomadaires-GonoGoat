/**
 * 
 */
package tp3;

/**
 * @author HE201654
 *
 */
public class estPaire {
	
	/**
	*Cette méthode vérifie si un nombre est pair
	*@param n un nombre entier différent de 0
	*@return true si le nombre est pair
	*@return false si le nombre est impair
	*/
	boolean estPair(int n) {
		if (n % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	/**
	*Cette méthode calcule le périmètre d'un carré
	*@param n > 0 la longueur du côté en centimètre
	*@return un nombre >0, pérmètre du carré de longueur n
	*/
	double perimetreCarre(double n) {
		return 4*n;
	}
	/**
	*Cette méthode vérifie la présence d'un caractère dans une chaine de caractère
	*@param n le caractère recherché
	*@param s la chaine de caractère à vérifier
	*@return true si le caractère n se trouve dans la chaine de caractère s
	*@return false si le caractère n ne se trouve pas dans la chaine de caractère s
	*/
	boolean contientCaractère(char n, String s) {
		for (int i = 0; i<s.length();i++) {
			if (n == s.charAt(i)) {
				return true;
			}
			else {}
		}
		return false;
	}
	
	
}
