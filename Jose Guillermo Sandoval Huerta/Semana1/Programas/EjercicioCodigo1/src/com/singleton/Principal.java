package com.singleton;

public class Principal {

	public static void main(String[] args) {
		Avengers vengador = Avengers.getInstance();
        System.out.println(vengador + "\n");

        // Agregar vengador
        vengador.nuevoIntegrante();
        vengador.numeroIntegrantes();
        
        // Agregar vengador
        vengador.nuevoIntegrante();
        vengador.numeroIntegrantes();
        
        // Salida vengador
        vengador.salidaIntegrante();
        vengador.numeroIntegrantes();

        // Salida vengador
        vengador.salidaIntegrante();
        vengador.numeroIntegrantes();

        // Salida vengador
        vengador.salidaIntegrante();
        vengador.numeroIntegrantes();
	}

}
