package inyeccionDependencias;

public class Aeromexico implements Avion {
	private String modelo;

	public Aeromexico(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public void reservacion() {
		System.out.println("Avion: Aeromexico - " + modelo);
	}
	
}
