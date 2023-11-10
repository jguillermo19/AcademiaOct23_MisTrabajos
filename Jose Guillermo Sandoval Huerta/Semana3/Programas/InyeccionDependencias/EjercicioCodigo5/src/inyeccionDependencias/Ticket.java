package inyeccionDependencias;

public class Ticket {
	private String numeroTicket;
	private String nombrePasajero;
	private String destino;
	private String fechaSalida;
	Avion avion;
	private Avion avion2;
	
	public Ticket(String numeroTicket, String nombrePasajero, String destino, String fechaSalida) {
		this.numeroTicket = numeroTicket;
		this.nombrePasajero = nombrePasajero;
		this.destino = destino;
		this.fechaSalida = fechaSalida;
	}
	
	public void setAvion2(Avion avion2) {
		this.avion2 = avion2;
	}

	void reservarAvion() {
		System.out.println("***************************" +
						"\nNúmero Ticket: " + numeroTicket + 
						"\nPasajero: " + nombrePasajero + 
						"\nDestino: " + destino +
						"\\nFecha Salida: " + fechaSalida);
		avion.reservacion();
	}

	void reservarAvion2() {
		System.out.println("***************************" +
						"\nNúmero Ticket: " + numeroTicket + 
						"\nPasajero: " + nombrePasajero + 
						"\nDestino: " + destino +
						"\\nFecha Salida: " + fechaSalida);
		avion2.reservacion();
	}

}
