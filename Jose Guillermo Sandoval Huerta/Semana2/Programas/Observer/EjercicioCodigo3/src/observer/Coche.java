package observer;

public class Coche extends Observador{
	private String color;
	
	public Coche(String color, Sujeto sj) {
		super(sj);
		this.color = color;
	} 
	
	void acelerar() {
		System.out.println("Coche "+color+": acelerar");
	}
	
	void frenar() {
		System.out.println("Coche "+color+": frenar");
	}
	
	void parar() {
		System.out.println("Coche "+color+": parar");
	}

	@Override
	void verLuzVerde() {
		acelerar();
	}

	@Override
	void verLuzAmarrilla() {
		frenar();
	}

	@Override
	void verLuzRoja() {
		parar();
	}
}
