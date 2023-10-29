package com.superheroe;

public class SpiderAnimal extends SpiderPeopleVerso{

	public SpiderAnimal(String nombreCivil, String nombreSpider, int universo) {
		super(nombreCivil, nombreSpider, universo);
	}

	@Override
	String tipoHabilidad(int tipo) {
		String habilidad = "Habilidad: ";
		
		switch (tipo) {
			case 1:
				habilidad += "Lanzar telaraña";
				break;
			case 2:
				habilidad += "Trepar muros";
				break;
			default:
				habilidad += "Super reflejos";
		}
		
		return habilidad;
	}
	
	@Override
	public void origenPoder() {
		System.out.println("Origen Poder: Experimento Laboratorio\n");
	}
}
