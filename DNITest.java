import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DNITest {

	@Test
	void testDniValido() {
		boolean resultado = DNI.dniValido("00000022E");
		
		boolean esperado = true;
		
		assertEquals(resultado, esperado);
	}

	@Test
	void testDniInvalido() {
		boolean resultado = DNI.dniValido("6545T");
		
		boolean esperado = true;
		
		assertEquals(resultado, esperado);
	}
	
	@Test
	void testLetraValida() {
		String resultado = DNI.letraDNI(00000000);
		
		String esperado = "T";
		
		assertEquals(resultado, esperado);
		
	}
	
	@Test 
	void testLetraInvalida() {
		String resultado = DNI.letraDNI(00000000);
		
		String esperado = "A";
		
		assertEquals(resultado, esperado);
		
	}
}
