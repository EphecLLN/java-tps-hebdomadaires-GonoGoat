package tp2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatriceTest {

	@Test
	void testCarre() {
		Calculatrice calc = new Calculatrice(2);
		assertEquals(4, calc.carre());
	}

}
