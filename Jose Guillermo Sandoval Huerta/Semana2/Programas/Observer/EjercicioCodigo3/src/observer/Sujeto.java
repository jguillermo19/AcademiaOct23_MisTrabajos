package observer;

import java.util.*;

public class Sujeto {
	
	List<Observador> listaObservadores = new ArrayList<>();

	void agregarObservador(Observador o) {
		listaObservadores.add(o);
	}
	
	void eliminarObservador(Observador o) {
		listaObservadores.remove(o);
	}
	
	void cambiarVerde() {
		System.out.println("**********Luz Verde***********");
		for (Observador o:listaObservadores)
			o.verLuzVerde();
	}
	
	void cambiarAmarillo() {
		System.out.println("**********Luz Amarilla***********");
		for (Observador o:listaObservadores)
			o.verLuzAmarrilla();
	}
	
	void cambiarRojo() {
		System.out.println("**********Luz Roja***********");
		for (Observador o:listaObservadores)
			o.verLuzRoja();
	}
}
