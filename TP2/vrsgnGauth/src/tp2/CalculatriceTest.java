package tp2;

class CalculatriceTest {

	@Test
	void testCarre() {
		Calculatrice calc = new Calculatrice(2);
		assertEquals(4, calc.carre());
	}

}
