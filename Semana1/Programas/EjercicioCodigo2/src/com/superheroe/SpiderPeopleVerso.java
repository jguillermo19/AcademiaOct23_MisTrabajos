package com.superheroe;

public abstract class SpiderPeopleVerso implements Poder{

	private String nombreCivil;
	private String nombreSpider;
	private int universo;

	public SpiderPeopleVerso(String nombreCivil, String nombreSpider, int universo) {
		this.nombreCivil = nombreCivil;
		this.nombreSpider = nombreSpider;
		this.universo = universo;
	}

	public String getNombreCivil() {
		return nombreCivil;
	}

	abstract String tipoHabilidad(int tipo);

	@Override
	public String toString() {
		return 	this.nombreSpider + ", Universo: " + this.universo;
	}
	
}
