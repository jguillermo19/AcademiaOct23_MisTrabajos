package inyeccionDependencias;

public class Volaris  implements Avion {
	private String modelo;

	public Volaris(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public void reservacion() {
		System.out.println("Avion: Volaris - " + modelo);
	}
	
}
