/**
 * 
 */
package tp6Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import tp6.Personne;

/**
 * @author HE201654
 *
 */
class PersonneTest {

	@Test
	void testEquals() {
		Personne p = new Personne("Paul", "Pierre", 2);
		Personne j = new Personne("Jean", "Michel", 3);
		assertTrue(p.equals(p));
		assertFalse(p.equals(j));
	}

}
