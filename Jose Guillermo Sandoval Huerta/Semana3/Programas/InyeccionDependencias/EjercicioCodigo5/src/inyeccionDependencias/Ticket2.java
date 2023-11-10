package inyeccionDependencias;

public class Ticket2 {
	
	private String numeroTicket;
	private String nombrePasajero;
	private String destino;
	private String fechaSalida;
	private Avion avion;
	
	public Ticket2(String numeroTicket, String nombrePasajero, String destino, String fechaSalida, Avion avion) {
		this.numeroTicket = numeroTicket;
		this.nombrePasajero = nombrePasajero;
		this.destino = destino;
		this.fechaSalida = fechaSalida;
		this.avion = avion;
	}

	void reservarAvion() {
		System.out.println("***************************" +
						"\nNúmero Ticket: " + numeroTicket + 
						"\nPasajero: " + nombrePasajero + 
						"\nDestino: " + destino +
						"\\nFecha Salida: " + fechaSalida);
		avion.reservacion();
	}
}
