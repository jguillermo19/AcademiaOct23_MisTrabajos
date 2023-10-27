package com.superheroe;

public class Simbionte extends SpiderPeopleVerso{

	public Simbionte(String nombreCivil, String nombreSpider, int universo) {
		super(nombreCivil, nombreSpider, universo);
	}

	@Override
	String tipoHabilidad(int tipo) {
		String habilidad = "Habilidad: ";
		
		switch (tipo) {
			case 1:
				habilidad += "Cambio de forma";
				break;
			case 2:
				habilidad += "Trepar muros";
				break;
			case 3:
				habilidad += "Factor de curación acelerado";
				break;
			case 4:
				habilidad += "Camuflaje";
				break;
			default:
				habilidad += "Super reflejos";
		}
		
		return habilidad;
	}
	
	@Override
	public void origenPoder() {
		System.out.println("Origen Poder: Uso de simbionte\n");
	}
}
