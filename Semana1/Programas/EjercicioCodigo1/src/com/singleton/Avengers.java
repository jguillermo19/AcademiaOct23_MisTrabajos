package com.singleton;

public class Avengers {
	private static Avengers intanciaVengador;
	private String nombreEquipo;
    private int tamanoEquipo;
    
    private Avengers() {
    	nombreEquipo = "Los Vengadores";
    	tamanoEquipo = 6; // tamaño inicial de integrantes en el equipo
    }
    
    // Patron Singleton
    public static Avengers getInstance() {
        if (intanciaVengador == null) {
        	intanciaVengador = new Avengers();
        }
        return intanciaVengador;
    }
    
    public void nuevoIntegrante() {
    	System.out.println("¡Nuevo integrante en el equipo!");
    	tamanoEquipo++;
    }
    
    public void salidaIntegrante() {
        if (tamanoEquipo > 0) {
        	System.out.println("¡Ha salido un integrante del equipo!");
        	tamanoEquipo--;
        }
    }
    
    public void numeroIntegrantes() {
    	System.out.println("Tamaño del equipo: " + tamanoEquipo + " miembros\n");
    }

	@Override
	public String toString() {
		return "Nombre del equipo: " + nombreEquipo +
			   "\nTamaño del equipo: " + tamanoEquipo + " miembros";
	}
}
