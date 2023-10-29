package com.singleton;

public class Singleton {
	private String nombre;
	static int contador;
	private static Singleton singleton;
	
	private Singleton(String nombre) {
		this.nombre = nombre;
		contador++;
	}
	
	public static Singleton getInstance() {
		if(singleton == null) {
			singleton = new Singleton("Mysql");
			return singleton;
		} else {
			return singleton;
		}
	}
}
