package observer;

public class Policia extends Observador{
	
	private String tipo;

	public Policia(String tipo, Sujeto sj) {
		super(sj);
		this.tipo = tipo;
	}
	
	void dirigirPeaton() {
		System.out.println("Policia de "+ tipo +": dirigir peatón");
	}
	
	void pararCoches() {
		System.out.println("Policia de "+ tipo +": parar coches");
	}
	
	void dirigirCoches() {
		System.out.println("Policia de "+ tipo +": dirigir coches");
	}
	
	@Override
	void verLuzVerde() {
		dirigirCoches();
	}

	@Override
	void verLuzAmarrilla() {
		pararCoches();
	}

	@Override
	void verLuzRoja() {
		dirigirPeaton();
	}
}
