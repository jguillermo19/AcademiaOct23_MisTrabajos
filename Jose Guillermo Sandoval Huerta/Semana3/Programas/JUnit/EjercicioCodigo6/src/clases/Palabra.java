package clases;

public class Palabra {

	public boolean esPalindromo(String palabra) {
        palabra = palabra.replaceAll("\\s", "").toLowerCase();
        String palabraInvertida = new StringBuilder(palabra).reverse().toString();
        return palabra.equals(palabraInvertida);
    }
	
	public boolean contrasena(String palabra) {
		if (palabra.length() < 6)
			return false;
        if (palabra.matches(".*[#$/()*=\\s].*"))
        	return false;
        return true;
    }
	
	public int tamano(String palabra) {
        palabra = palabra.replaceAll("\\s", "").toLowerCase();
		return palabra.length();
    }
	
}
