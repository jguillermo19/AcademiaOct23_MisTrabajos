package inyeccionDependencias;

public class InyectorAvion {

	static Volaris volaris = new Volaris("AirbusA320");
	static Aeromexico aeromexico = new Aeromexico("Boeing 787");
	static VivaAerobus vivaAerobus = new VivaAerobus("Airbus A320neo");

	static void inyectarAvion(Ticket ticket, String avion) {
		if(avion == "vs")
			ticket.avion = volaris;
		else if(avion == "am")
			ticket.avion = aeromexico; 
		else if(avion == "va")
			ticket.avion = vivaAerobus; 
	}

	static void inyectarAvion2(Ticket ticket, String avion) {
		if(avion == "vs")
			ticket.setAvion2(volaris);
		else if(avion == "am")
			ticket.setAvion2(aeromexico);
		else if(avion == "va")
			ticket.setAvion2(vivaAerobus);
	}
	
	static Ticket2 inyectarAvion3(String avion) {
		if(avion == "vs")
			return new Ticket2("A106", "Patrobas", "Cancún", "Enero 2024", volaris);
		else if(avion == "am")
			return new Ticket2("JA20", "Epeneto", "Monterrey", "Abril 2024", aeromexico);
		else if(avion == "va")
			return new Ticket2("C002", "Andronico", "Guanajuato", "Diciembre 2023", vivaAerobus);
		
		return null;
	}
}
