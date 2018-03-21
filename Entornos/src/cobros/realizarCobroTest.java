package cobros;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class realizarCobroTest {

	@Test
	void realizarCobroTest() {
		Cobros test = new Cobros();
		double output = test.realizarCobro(30.40, 40.50);
		assertEquals(10.100000000000001, output);
		
	}

}
