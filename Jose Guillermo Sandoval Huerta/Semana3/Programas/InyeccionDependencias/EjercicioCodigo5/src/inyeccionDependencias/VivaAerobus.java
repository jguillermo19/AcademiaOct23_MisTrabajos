package inyeccionDependencias;

public class VivaAerobus implements Avion {
	private String modelo;

	public VivaAerobus(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public void reservacion() {
		System.out.println("Avion: VivaAerobus - " + modelo);
	}
	
}
