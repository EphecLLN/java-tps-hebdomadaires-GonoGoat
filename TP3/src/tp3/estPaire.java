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
	*Cette m�thode v�rifie si un nombre est pair
	*@param n un nombre entier diff�rent de 0
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
	*Cette m�thode calcule le p�rim�tre d'un carr�
	*@param n > 0 la longueur du c�t� en centim�tre
	*@return un nombre >0, p�rm�tre du carr� de longueur n
	*/
	double perimetreCarre(double n) {
		return 4*n;
	}
	/**
	*Cette m�thode v�rifie la pr�sence d'un caract�re dans une chaine de caract�re
	*@param n le caract�re recherch�
	*@param s la chaine de caract�re � v�rifier
	*@return true si le caract�re n se trouve dans la chaine de caract�re s
	*@return false si le caract�re n ne se trouve pas dans la chaine de caract�re s
	*/
	boolean contientCaract�re(char n, String s) {
		for (int i = 0; i<s.length();i++) {
			if (n == s.charAt(i)) {
				return true;
			}
			else {}
		}
		return false;
	}
	
	
}
