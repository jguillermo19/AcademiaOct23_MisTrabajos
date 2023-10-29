package com.superheroe;

public class Spiderman extends SpiderPeopleVerso{

	public Spiderman(String nombreCivil, String nombreSpider, int universo) {
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
			case 3:
				habilidad += "Lanzar veneno paralizante";
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
		System.out.println("Origen Poder: Picado por una araña radioactiva\n");
	}

}
