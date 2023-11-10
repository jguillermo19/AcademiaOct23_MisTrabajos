package junit;

import static org.junit.jupiter.api.Assertions.*;

import clases.Palabra;

class Test {

	@org.junit.jupiter.api.Test
	void testPalindromo() {
		String palabra = "anita lava la tina";
		Palabra palRespuesta = new Palabra();
		assertTrue(palRespuesta.esPalindromo(palabra));
	}
	
	@org.junit.jupiter.api.Test
	void testVerificarContrasena() {
		String palabra = "#qwerty4";
		Palabra palRespuesta = new Palabra();
		assertFalse(palRespuesta.contrasena(palabra));
	}
	
	@org.junit.jupiter.api.Test
	void testTamanoIgual() {
		String palabra = "anita lava la tina";
		int tamano = 15;
		Palabra palRespuesta = new Palabra();
		assertEquals(tamano,palRespuesta.tamano(palabra));
	}

}
